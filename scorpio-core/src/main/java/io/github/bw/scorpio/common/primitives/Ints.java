package io.github.bw.scorpio.common.primitives;

import static io.github.bw.scorpio.common.base.Preconditions.checkArgument;
import static io.github.bw.scorpio.common.base.Preconditions.checkElementIndex;
import static io.github.bw.scorpio.common.base.Preconditions.checkNotNull;
import static io.github.bw.scorpio.common.base.Preconditions.checkPositionIndexes;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;


public final class Ints {

  private Ints() {
  }

  public static final int BYTES = Integer.SIZE / Byte.SIZE;

  public static final int MAX_POWER_OF_TWO = 1 << (Integer.SIZE - 2);

  public static int checkedCast(long value) {
    int result = (int) value;
    checkArgument(result == value, "Out of range: %s", value);
    return result;
  }

  public static int saturatedCast(long value) {
    if (value > Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }
    if (value < Integer.MIN_VALUE) {
      return Integer.MIN_VALUE;
    }
    return (int) value;
  }

  public static int compare(int a, int b) {
    return Integer.compare(a, b);
  }

  public static boolean contains(int[] array, int target) {
    for (int value : array) {
      if (value == target) {
        return true;
      }
    }
    return false;
  }

  public static int indexOf(int[] array, int target) {
    return indexOf(array, target, 0, array.length);
  }

  public static int indexOf(int[] array, int target, int start, int end) {
    for (int i = start; i < end; i++) {
      if (array[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int lastIndexOf(int[] array, int target) {
    return lastIndexOf(array, target, 0, array.length);
  }

  private static int lastIndexOf(int[] array, int target, int start, int end) {
    for (int i = end - 1; i >= start; i--) {
      if (array[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int min(int... array) {
    checkArgument(array.length > 0);
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

  public static int max(int... array) {
    checkArgument(array.length > 0);
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  /**
   * Returns the values from each provided array combined into a single array. For example,
   * {@code concat(new int[] {a, b}, new int[] {}, new int[] {c}} returns the array {@code {a, b, c}}.
   *
   * @param arrays zero or more {@code int} arrays
   * @return a single array containing all the values from the source arrays, in order
   */
  public static int[] concat(int[]... arrays) {
    int length = 0;
    for (int[] array : arrays) {
      length += array.length;
    }
    int[] result = new int[length];
    int pos = 0;
    for (int[] array : arrays) {
      System.arraycopy(array, 0, result, pos, array.length);
      pos += array.length;
    }
    return result;
  }

  public static byte[] toByteArray(int value) {
    return new byte[]{
        (byte) (value >> 24), (byte) (value >> 16), (byte) (value >> 8), (byte) value
    };
  }

  /**
   * Returns a string containing the supplied {@code int} values separated by {@code separator}. For example,
   * {@code join("-", 1, 2, 3)} returns the string {@code "1-2-3"}.
   *
   * @param separator the text that should appear between consecutive values in the resulting string (but not at the
   *                  start or end)
   * @param array     an array of {@code int} values, possibly empty
   */
  public static String join(String separator, int... array) {
    checkNotNull(separator);
    if (array.length == 0) {
      return "";
    }

    // For pre-sizing a builder, just get the right order of magnitude
    StringBuilder builder = new StringBuilder(array.length * 5);
    builder.append(array[0]);
    for (int i = 1; i < array.length; i++) {
      builder.append(separator).append(array[i]);
    }
    return builder.toString();
  }

  public static void sortDescending(int[] array) {
    checkNotNull(array);
    sortDescending(array, 0, array.length);
  }

  public static void sortDescending(int[] array, int fromIndex, int toIndex) {
    checkNotNull(array);
    checkPositionIndexes(fromIndex, toIndex, array.length);
    Arrays.sort(array, fromIndex, toIndex);
    reverse(array, fromIndex, toIndex);
  }

  public static void reverse(int[] array) {
    checkNotNull(array);
    reverse(array, 0, array.length);
  }

  public static void reverse(int[] array, int fromIndex, int toIndex) {
    checkNotNull(array);
    checkPositionIndexes(fromIndex, toIndex, array.length);
    for (int i = fromIndex, j = toIndex - 1; i < j; i++, j--) {
      int tmp = array[i];
      array[i] = array[j];
      array[j] = tmp;
    }
  }

  public static int[] toArray(Collection<? extends Number> collection) {
    if (collection instanceof IntArrayAsList) {
      return ((IntArrayAsList) collection).toIntArray();
    }

    Object[] boxedArray = collection.toArray();
    int len = boxedArray.length;
    int[] array = new int[len];
    for (int i = 0; i < len; i++) {
      checkNotNull(boxedArray[i]);
      array[i] = ((Number) boxedArray[i]).intValue();
    }
    return array;
  }

  public static List<Integer> asList(int... backingArray) {
    if (backingArray.length == 0) {
      return Collections.emptyList();
    }
    return new IntArrayAsList(backingArray);
  }

  private static class IntArrayAsList extends AbstractList<Integer>
      implements RandomAccess, Serializable {

    final int[] array;
    final int start;
    final int end;

    IntArrayAsList(int[] array) {
      this(array, 0, array.length);
    }

    IntArrayAsList(int[] array, int start, int end) {
      this.array = array;
      this.start = start;
      this.end = end;
    }

    @Override
    public int size() {
      return end - start;
    }

    @Override
    public boolean isEmpty() {
      return false;
    }

    @Override
    public Integer get(int index) {
      checkElementIndex(index, size());
      return array[start + index];
    }

    @Override
    public Spliterator.OfInt spliterator() {
      return Spliterators.spliterator(array, start, end, 0);
    }

    @Override
    public boolean contains(Object target) {
      // Overridden to prevent a ton of boxing
      return (target instanceof Integer) && Ints.indexOf(array, (Integer) target, start, end) != -1;
    }

    @Override
    public int indexOf(Object target) {
      // Overridden to prevent a ton of boxing
      if (target instanceof Integer) {
        int i = Ints.indexOf(array, (Integer) target, start, end);
        if (i >= 0) {
          return i - start;
        }
      }
      return -1;
    }

    @Override
    public int lastIndexOf(Object target) {
      // Overridden to prevent a ton of boxing
      if (target instanceof Integer) {
        int i = Ints.lastIndexOf(array, (Integer) target, start, end);
        if (i >= 0) {
          return i - start;
        }
      }
      return -1;
    }

    @Override
    public Integer set(int index, Integer element) {
      checkElementIndex(index, size());
      int oldValue = array[start + index];
      checkNotNull(element);
      array[start + index] = element;
      return oldValue;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
      int size = size();
      checkPositionIndexes(fromIndex, toIndex, size);
      if (fromIndex == toIndex) {
        return Collections.emptyList();
      }
      return new IntArrayAsList(array, start + fromIndex, start + toIndex);
    }

    @Override
    public boolean equals(Object object) {
      if (object == this) {
        return true;
      }
      if (object instanceof IntArrayAsList) {
        IntArrayAsList that = (IntArrayAsList) object;
        int size = size();
        if (that.size() != size) {
          return false;
        }
        for (int i = 0; i < size; i++) {
          if (array[start + i] != that.array[that.start + i]) {
            return false;
          }
        }
        return true;
      }
      return super.equals(object);
    }

    @Override
    public int hashCode() {
      int result = 1;
      for (int i = start; i < end; i++) {
        result = 31 * result + array[i];
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder(size() * 5);
      builder.append('[').append(array[start]);
      for (int i = start + 1; i < end; i++) {
        builder.append(", ").append(array[i]);
      }
      return builder.append(']').toString();
    }

    int[] toIntArray() {
      return Arrays.copyOfRange(array, start, end);
    }

    private static final long serialVersionUID = 0;
  }
}

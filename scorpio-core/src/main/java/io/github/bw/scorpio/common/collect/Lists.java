package io.github.bw.scorpio.common.collect;


import static io.github.bw.scorpio.common.base.Preconditions.checkNotNull;

import io.github.bw.scorpio.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Lists {

  private Lists() {
  }

  public static <E> ArrayList<E> nullToEmpty(ArrayList<E> list) {
    if (list == null) {
      return new ArrayList<>();
    }
    return list;
  }

  public static <E> LinkedList<E> nullToEmptyLinkedList(LinkedList<E> list) {
    if (list == null) {
      return new LinkedList<>();
    }
    return list;
  }

  public static <E> ArrayList<E> newArrayList() {
    return new ArrayList<>();
  }

  @SafeVarargs
  public static <E> ArrayList<E> of(E... elements) {
    checkNotNull(elements);
    validRange(elements.length);
    ArrayList<E> list = new ArrayList<>(elements.length);
    Collections.addAll(list, elements);
    return list;
  }

  @SafeVarargs
  public static <E> ArrayList<E> newArrayList(E... elements) {
    checkNotNull(elements);
    validRange(elements.length);
    ArrayList<E> list = new ArrayList<>(elements.length);
    Collections.addAll(list, elements);
    return list;
  }

  public static <E> ArrayList<E> newArrayListWithCapacity(int initialArraySize) {
    validRange(initialArraySize);
    return new ArrayList<>(initialArraySize);
  }

  public static <E> LinkedList<E> newLinkedList() {
    return new LinkedList<>();
  }

  @SafeVarargs
  public static <E> LinkedList<E> newLinkedList(E... elements) {
    checkNotNull(elements);
    validRange(elements.length);
    LinkedList<E> list = new LinkedList<>();
    Collections.addAll(list, elements);
    return list;
  }

  public static <E> ArrayList<E> from(Collection<? extends E> c) {
    return new ArrayList<>(c);
  }

  public static <E> List<E> get(List<E> param, Supplier<? extends List<E>> supplier) {
    return Optional.ofNullable(param).orElseGet(supplier);
  }

  public static <E> List<E> get(List<E> param, List<E> other) {
    return Optional.ofNullable(param).orElse(other);
  }

  private static void validRange(int arraySize) {
    Preconditions.checkArgument(arraySize >= 0 && arraySize < Integer.MAX_VALUE,
        "array size should range [0, 0x7fffffff)");
  }

}

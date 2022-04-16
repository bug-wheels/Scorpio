package io.github.bw.scorpio.common.collect;


import io.github.bw.scorpio.common.base.Preconditions;
import io.github.bw.scorpio.common.primitives.Ints;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

public class Maps {

  private Maps() {
  }

  public static <K, V> HashMap<K, V> nullToEmpty(HashMap map) {
    if (map == null) {
      return new HashMap<>();
    }
    return map;
  }

  public static <K, V> LinkedHashMap<K, V> nullToEmptyLinkedHashMap(LinkedHashMap map) {
    if (map == null) {
      return new LinkedHashMap<>();
    }
    return map;
  }

  public static <K, V> HashMap<K, V> newHashMap() {
    return new HashMap<>();
  }

  public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
    return new HashMap<>(map);
  }

  public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int expectedSize) {
    validRange(expectedSize);
    return new HashMap<>(capacity(expectedSize));
  }

  public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
    return new LinkedHashMap<>();
  }

  public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
    return new LinkedHashMap<>(map);
  }

  public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int expectedSize) {
    validRange(expectedSize);
    return new LinkedHashMap<>(capacity(expectedSize));
  }

  public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
    return new ConcurrentHashMap<>();
  }

  public static <K, V> Map<K, V> get(Map<K, V> param, Supplier<? extends Map<K, V>> supplier) {
    return Optional.ofNullable(param).orElseGet(supplier);
  }

  public static <K, V> Map<K, V> get(Map<K, V> param, Map<K, V> other) {
    return Optional.ofNullable(param).orElse(other);
  }

  private static void validRange(int arraySize) {
    Preconditions.checkArgument(arraySize >= 0 && arraySize < Integer.MAX_VALUE,
        "map size should range [0, 0x7fffffff)");
  }

  static int capacity(int expectedSize) {
    if (expectedSize < 3) {
      checkNonnegative(expectedSize, "expectedSize");
      return expectedSize + 1;
    }
    if (expectedSize < Ints.MAX_POWER_OF_TWO) {
      return (int) ((float) expectedSize / 0.75F + 1.0F);
    }
    return Integer.MAX_VALUE;
  }

  static int checkNonnegative(int value, String name) {
    if (value < 0) {
      throw new IllegalArgumentException(name + " cannot be negative but was: " + value);
    }
    return value;
  }
}

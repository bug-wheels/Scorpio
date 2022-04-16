package io.github.bw.scorpio.common.collect;

import io.github.bw.scorpio.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;


/**
 * The type Sets.
 */
public class Sets {

  private Sets() {
  }

  /**
   * Null to empty hash set.
   *
   * @param <E> the type parameter
   * @param set the set
   * @return the hash set
   */
  public static <E> HashSet<E> nullToEmpty(HashSet<E> set) {
    if (set == null) {
      return new HashSet<>();
    }
    return set;
  }

  /**
   * Null to empty linked hash set linked hash set.
   *
   * @param <E> the type parameter
   * @param set the set
   * @return the linked hash set
   */
  public static <E> LinkedHashSet<E> nullToEmptyLinkedHashSet(LinkedHashSet<E> set) {
    if (set == null) {
      return new LinkedHashSet<>();
    }
    return set;
  }

  /**
   * New hash set.
   *
   * @param <E> the type parameter
   * @return the hash set
   */
  public static <E> HashSet<E> newHashSet() {
    return new HashSet<E>();
  }

  /**
   * New hash set.
   *
   * @param <E>      the type parameter
   * @param elements the elements
   * @return the hash set
   */
  @SafeVarargs
  public static <E> HashSet<E> newHashSet(E... elements) {
    validRange(elements.length);
    HashSet<E> set = newHashSetWithExpectedSize(elements.length);
    Collections.addAll(set, elements);
    return set;
  }

  /**
   * New hash set hash set.
   *
   * @param <E>        the type parameter
   * @param collection the collection
   * @return the hash set
   */
  public static <E> HashSet<E> newHashSet(Collection<E> collection) {
    validRange(collection.size());
    HashSet<E> set = newHashSetWithExpectedSize(collection.size());
    set.addAll(collection);
    return set;
  }

  /**
   * New hash set with expected size hash set.
   *
   * @param <E>          the type parameter
   * @param expectedSize the expected size
   * @return the hash set
   */
  public static <E> HashSet<E> newHashSetWithExpectedSize(int expectedSize) {
    return new HashSet<E>(Maps.capacity(expectedSize));
  }

  /**
   * New linked hash set linked hash set.
   *
   * @param <E> the type parameter
   * @return the linked hash set
   */
  public static <E> LinkedHashSet<E> newLinkedHashSet() {
    return new LinkedHashSet<>();
  }

  /**
   * New linked hash set linked hash set.
   *
   * @param <E>      the type parameter
   * @param elements the elements
   * @return the linked hash set
   */
  @SafeVarargs
  public static <E> LinkedHashSet<E> newLinkedHashSet(E... elements) {
    validRange(elements.length);
    LinkedHashSet<E> set = newLinkedHashSetWithExpectedSize(elements.length);
    Collections.addAll(set, elements);
    return set;
  }

  /**
   * New linked hash set linked hash set.
   *
   * @param <E>        the type parameter
   * @param collection the collection
   * @return the linked hash set
   */
  public static <E> LinkedHashSet<E> newLinkedHashSet(Collection<E> collection) {
    validRange(collection.size());
    LinkedHashSet<E> set = newLinkedHashSetWithExpectedSize(collection.size());
    set.addAll(collection);
    return set;
  }

  /**
   * New linked hash set with expected size linked hash set.
   *
   * @param <E>          the type parameter
   * @param expectedSize the expected size
   * @return the linked hash set
   */
  public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int expectedSize) {
    return new LinkedHashSet<E>(Maps.capacity(expectedSize));
  }

  /**
   * New concurrent hash.
   *
   * @param <E> the type parameter
   * @return the set
   */
  public static <E> Set<E> newConcurrentHashSet() {
    return Collections.newSetFromMap(new ConcurrentHashMap<E, Boolean>());
  }

  /**
   * Get set.
   *
   * @param <E>      the type parameter
   * @param param    the param
   * @param supplier the supplier
   * @return the set
   */
  public static <E> Set<E> get(Set<E> param, Supplier<? extends Set<E>> supplier) {
    return Optional.ofNullable(param).orElseGet(supplier);
  }

  /**
   * Get set.
   *
   * @param <E>   the type parameter
   * @param param the param
   * @param other the other
   * @return the set
   */
  public static <E> Set<E> get(Set<E> param, Set<E> other) {
    return Optional.ofNullable(param).orElse(other);
  }

  private static void validRange(int arraySize) {
    Preconditions.checkArgument(arraySize >= 0 && arraySize < Integer.MAX_VALUE,
        "set size should range [0, 0x7fffffff)");
  }


}

package io.github.bw.scorpio.common.collect;

import java.util.Collection;

public final class Iterables {

  private Iterables() {
  }

  public static <T> boolean addAll(Collection<T> addTo, Iterable<? extends T> elementsToAdd) {
    if (elementsToAdd instanceof Collection) {
      Collection<? extends T> c = CollectionUtil.cast(elementsToAdd);
      return addTo.addAll(c);
    }
    return Iterators.addAll(addTo, elementsToAdd.iterator());
  }
}

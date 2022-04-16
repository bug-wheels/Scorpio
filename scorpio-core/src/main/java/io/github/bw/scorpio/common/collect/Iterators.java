package io.github.bw.scorpio.common.collect;

import io.github.bw.scorpio.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;

public class Iterators {

  private Iterators() {
  }

  public static <T> boolean addAll(Collection<T> addTo, Iterator<? extends T> iterator) {
    Preconditions.checkNotNull(addTo);
    Preconditions.checkNotNull(iterator);
    boolean wasModified = false;
    while (iterator.hasNext()) {
      wasModified |= addTo.add(iterator.next());
    }
    return wasModified;
  }
}

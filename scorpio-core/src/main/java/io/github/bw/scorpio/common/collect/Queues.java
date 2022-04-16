package io.github.bw.scorpio.common.collect;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Queues {

  private Queues() {
  }

  public static <E> ArrayBlockingQueue<E> newArrayBlockingQueue(int capacity) {
    return new ArrayBlockingQueue<E>(capacity);
  }

  public static <E> ArrayDeque<E> newArrayDeque() {
    return new ArrayDeque<E>();
  }

  public static <E> ArrayDeque<E> newArrayDeque(Iterable<? extends E> elements) {
    if (elements instanceof Collection) {
      return new ArrayDeque<E>(CollectionUtil.cast(elements));
    }
    ArrayDeque<E> deque = new ArrayDeque<E>();
    Iterables.addAll(deque, elements);
    return deque;
  }

  // ConcurrentLinkedQueue

  public static <E> ConcurrentLinkedQueue<E> newConcurrentLinkedQueue() {
    return new ConcurrentLinkedQueue<E>();
  }

  public static <E> ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(
      Iterable<? extends E> elements) {
    if (elements instanceof Collection) {
      return new ConcurrentLinkedQueue<E>(CollectionUtil.cast(elements));
    }
    ConcurrentLinkedQueue<E> queue = new ConcurrentLinkedQueue<E>();
    Iterables.addAll(queue, elements);
    return queue;
  }

}

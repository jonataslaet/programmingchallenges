package com.github.jonataslaet.programmingchallenges.datastructures.queue;

import java.util.Objects;

public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public T peek() {
        return head.getValue();
    }

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (Objects.nonNull(tail)) {
            tail.setNext(node);
        }
        tail = node;
        if (Objects.isNull(head)) {
            head = node;
        }
    }

    public T remove() {
        if (Objects.isNull(head)) return null;
        T removedValue = head.getValue();
        head = head.getNext();
        if (Objects.isNull(head)) tail = null;
        return removedValue;
    }
}

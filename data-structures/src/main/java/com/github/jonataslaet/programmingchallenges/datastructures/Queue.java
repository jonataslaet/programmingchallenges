package com.github.jonataslaet.programmingchallenges.datastructures;

import java.util.Objects;

public class Queue {

    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public Object peek() {
        return head.getValue();
    }

    public void add(Object value) {
        Node node = new Node(value);
        if (Objects.nonNull(tail)) {
            tail.setNext(node);
        }
        tail = node;
        if (Objects.isNull(head)) {
            head = node;
        }
    }

    public Object remove() {
        if (Objects.isNull(head)) return null;
        Object removedValue = head.getValue();
        head = head.getNext();
        if (Objects.isNull(head)) tail = null;
        return removedValue;
    }
}

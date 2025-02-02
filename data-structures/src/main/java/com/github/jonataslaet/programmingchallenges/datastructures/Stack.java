package com.github.jonataslaet.programmingchallenges.datastructures;

public class Stack {

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Object value) {
        Node node = new Node(top, value);
        top = node;
    }

    public Object pop() {
        Object removedValue = top.getValue();
        top = top.getNext();
        return removedValue;
    }

    public Object peek() {
        return top.getValue();
    }
}

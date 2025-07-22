package com.github.jonataslaet.programmingchallenges.datastructures.stack;

public class Stack {

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Object value) {
        Node node = new Node(value);
        node.setNext(top);
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

package com.github.jonataslaet.programmingchallenges.datastructures.stack;

public class Stack<T> {

    private Node<T> top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T value) {
        Node<T> node = new Node<>(value);
        node.setNext(top);
        top = node;
    }

    public T pop() {
        T removedValue = top.getValue();
        top = top.getNext();
        return removedValue;
    }

    public Object peek() {
        return top.getValue();
    }
}

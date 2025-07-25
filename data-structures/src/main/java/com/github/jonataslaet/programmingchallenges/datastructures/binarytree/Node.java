package com.github.jonataslaet.programmingchallenges.datastructures.binarytree;

public class Node<T> {
    private T value;
    private Node<T> left, right;

    public Node(T value) {
        this.value = value;
        left = right = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}

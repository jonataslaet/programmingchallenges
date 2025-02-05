package com.github.jonataslaet.programmingchallenges.datastructures.binarytree;

public class Node {
    private Integer value;
    private Node left, right;

    public Node(Integer value) {
        this.value = value;
        left = right = null;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

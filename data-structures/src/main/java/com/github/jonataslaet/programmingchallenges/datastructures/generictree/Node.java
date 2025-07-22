package com.github.jonataslaet.programmingchallenges.datastructures.generictree;

import java.util.ArrayList;
import java.util.List;

public class Node <T> {
    private T element;
    private Node<T> parent;
    private List<Node<T>> children;

    protected Node(T element) {
        this.element = element;
        this.children = new ArrayList<>();
    }

    protected T getElement() {
        return element;
    }

    protected void setElement(T element) {
        this.element = element;
    }

    protected Node<T> getParent() {
        return parent;
    }

    protected void setParent(Node<T> parent) {
        this.parent = parent;
    }

    protected List<Node<T>> getChildren() {
        return children;
    }

    protected Boolean isLeaf() {
        return this.children.isEmpty();
    }

    protected void addChild(Node<T> node) {
        this.children.add(node);
        node.setParent(this);
    }

    protected void removeChild(Node<T> child) {
        this.children.remove(child);
        child.setParent(null);
    }
}

package com.github.jonataslaet.programmingchallenges.datastructures.generictree;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Queue;
import java.util.LinkedList;

public class GenericTree <T> {
    private Node<T> root;
    private int size;

    public Boolean isEmpty() {
        return this.size == 0;
    }

    public Node<T> add(T element, Node<T> parent) {

        if (this.size > 0 && Objects.isNull(parent))
            throw new RuntimeException("Parent can't be null for a non-empty tree");

        Node<T> node = new Node<>(element);

        if (Objects.isNull(parent)) {
            this.root = node;
            this.size++;
            return node;
        }

        parent.addChild(node);
        this.size++;
        return node;
    }

    public List<Node<T>> getNodes() {
        List<Node<T>> nodes = new ArrayList<>();
        collectNodes(nodes, this.root);
        return nodes;
    }

    private void collectNodes(List<Node<T>> elements, Node<T> currentNode) {
        elements.add(currentNode);
        for (Node<T> child: currentNode.getChildren()) {
            collectNodes(elements, child);
        }
    }

    public List<T> getElements() {
        return getElements(this.root);
    }

    private List<T> getElements(Node<T> node) {
        List<T> elements = new ArrayList<>();
        collectElements(elements, node);
        return elements;
    }

    private void collectElements(List<T> elements, Node<T> currentNode) {
        elements.add(currentNode.getElement());
        for (Node<T> child: currentNode.getChildren()) {
            collectElements(elements, child);
        }
    }

    public void remove(Node<T> node) {
        if (this.isEmpty()) throw new RuntimeException("This is tree is empty");
        remove(this.root, node);
    }

    private void remove(Node<T> currentNode, Node<T> removedNode) {
        if (Objects.deepEquals(removedNode, this.root)) {
            this.size = 0;
            this.root = null;
        } else if (Objects.deepEquals(currentNode, removedNode)) {
            Node<T> parent = removedNode.getParent();
            parent.removeChild(removedNode);
            this.size -= subtreeSize(parent);
            return;
        }
        for (Node<T> child: currentNode.getChildren()) {
            remove(child, removedNode);
        }
    }

    public void showTree() {
        showNode(this.root, 1);
    }

    private void showNode(Node<T> currentNode, Integer order) {
        if (Objects.nonNull(currentNode)) {
            String prefixo = "\t".repeat(order);
            System.out.print(prefixo + currentNode.getElement());
            System.out.println();
            for(Node<T> child: currentNode.getChildren()) {
                showNode(child, 1 + order);
            }
        }
    }

    private Integer subtreeSize(Node<T> node) {
        return this.getElements(node).size();
    }

    public Node<T> getFoundNode(T element) {
        boolean isEmpty = this.isEmpty();
        if (isEmpty) return null;
        return getFoundNode(this.root, element);
    }

    private Node<T> getFoundNode(Node<T> currentNode, T element) {
        if (Objects.equals(element, currentNode.getElement())) {
            return currentNode;
        }
        for (Node<T> child: currentNode.getChildren()) {
            Node<T> foundNode = getFoundNode(child, element);
            if (Objects.nonNull(foundNode)) return foundNode;
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public Boolean isExternal(Node<T> pos1) {
        return pos1.isLeaf();
    }

    public Boolean isRoot(Node<T> node) {
        return Objects.nonNull(node) && Objects.isNull(node.getParent());
    }

    public Node<T> getParent(Node<T> node) {
        return node.getParent();
    }

    public T getElement(Node<T> node) {
        return node.getElement();
    }

    public void replace(Node<T> node, T element) {
        if (Objects.nonNull(node)) {
            node.setElement(element);
        }
    }

    public void showTreeBFS() {
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(this.root);
        while(!queue.isEmpty()) {
            Node<T> visitedNode = queue.poll();
            System.out.println(visitedNode.getElement());
            queue.addAll(visitedNode.getChildren());
        }
    }
}

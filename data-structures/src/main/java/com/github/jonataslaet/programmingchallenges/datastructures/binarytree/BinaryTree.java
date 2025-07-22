package com.github.jonataslaet.programmingchallenges.datastructures.binarytree;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(T value) {
        root = getInsertedNode(root, value);
    }

    private Node<T> getInsertedNode(Node<T> node, T value) {
        if (node == null) {
            node = new Node<>(value);
            return node;
        }

        if (value.compareTo(node.getValue()) < 0) {
            node.setLeft(getInsertedNode(node.getLeft(), value));
        } else if (value.compareTo(node.getValue()) > 0) {
            node.setRight(getInsertedNode(node.getRight(), value));
        }

        return node;
    }

    public boolean contains(T value) {
        return contains(root, value);
    }

    private boolean contains(Node<T> currentNode, T value) {
        if (currentNode == null) {
            return false;
        }

        if (currentNode.getValue().compareTo(value) == 0) {
            return true;
        }

        return value.compareTo(currentNode.getValue()) < 0 ?
            contains(currentNode.getLeft(), value) : contains(currentNode.getRight(), value);
    }

    public void showInOrder() {
        showInOrder(root);
        System.out.println();
    }

    private void showInOrder(Node<T> node) {
        if (node != null) {
            showInOrder(node.getLeft());
            System.out.print(node.getValue() + " ");
            showInOrder(node.getRight());
        }
    }

    public void showPreOrder() {
        showPreOrder(root);
        System.out.println();
    }

    private void showPreOrder(Node<T> root) {
        if (root != null) {
            System.out.print(root.getValue() + " ");
            showPreOrder(root.getLeft());
            showPreOrder(root.getRight());
        }
    }

    public void showPostOrder() {
        showPostOrder(root);
        System.out.println();
    }

    private void showPostOrder(Node<T> root) {
        if (root != null) {
            showPostOrder(root.getLeft());
            showPostOrder(root.getRight());
            System.out.print(root.getValue() + " ");
        }
    }

    // Método principal para testar a árvore
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        binaryTree.insert(50);
        binaryTree.insert(30);
        binaryTree.insert(70);
        binaryTree.insert(20);
        binaryTree.insert(40);
        binaryTree.insert(60);
        binaryTree.insert(80);

        System.out.println("Percurso em ordem:");
        binaryTree.showInOrder();

        System.out.println("Percurso pré-ordem:");
        binaryTree.showPreOrder();

        System.out.println("Percurso pós-ordem:");
        binaryTree.showPostOrder();

        System.out.println("Buscar 40: " + binaryTree.contains(40));
        System.out.println("Buscar 90: " + binaryTree.contains(90));
    }
}

package com.github.jonataslaet.programmingchallenges.datastructures.binarytree;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(Integer value) {
        root = getInsertedNode(root, value);
    }

    private Node getInsertedNode(Node node, Integer value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.getValue()) {
            node.setLeft(getInsertedNode(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(getInsertedNode(node.getRight(), value));
        }

        return node;
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(Node root, int value) {
        if (root == null) {
            return false;
        }

        if (root.getValue() == value) {
            return true;
        }

        return value < root.getValue() ? contains(root.getLeft(), value) : contains(root.getRight(), value);
    }

    public void showInOrder() {
        showInOrder(root);
        System.out.println();
    }

    private void showInOrder(Node root) {
        if (root != null) {
            showInOrder(root.getLeft());
            System.out.print(root.getValue() + " ");
            showInOrder(root.getRight());
        }
    }

    public void showPreOrder() {
        showPreOrder(root);
        System.out.println();
    }

    private void showPreOrder(Node root) {
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

    private void showPostOrder(Node root) {
        if (root != null) {
            showPostOrder(root.getLeft());
            showPostOrder(root.getRight());
            System.out.print(root.getValue() + " ");
        }
    }

    // Método principal para testar a árvore
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

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

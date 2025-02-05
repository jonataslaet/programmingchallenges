package com.github.jonataslaet.programmingchallenges.datastructures;

import com.github.jonataslaet.programmingchallenges.datastructures.binarytree.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestBinaryTree {

    @Test
    void testTreeIsEmptyInitially() {
        BinaryTree binaryTree = new BinaryTree();
        Assertions.assertFalse(binaryTree.contains(10));
    }

    @Test
    void testInsertElementsIntoTree() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(50);
        binaryTree.insert(30);
        binaryTree.insert(70);

        Assertions.assertTrue(binaryTree.contains(50));
        Assertions.assertTrue(binaryTree.contains(30));
        Assertions.assertTrue(binaryTree.contains(70));
        Assertions.assertFalse(binaryTree.contains(100));
    }

    @Test
    void testSearchExistingElements() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(15);
        binaryTree.insert(10);
        binaryTree.insert(20);

        Assertions.assertTrue(binaryTree.contains(15));
        Assertions.assertTrue(binaryTree.contains(10));
        Assertions.assertTrue(binaryTree.contains(20));
    }

    @Test
    void testSearchNonExistingElements() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(8);
        binaryTree.insert(3);
        binaryTree.insert(10);

        Assertions.assertFalse(binaryTree.contains(5));
        Assertions.assertFalse(binaryTree.contains(15));
    }

    @Test
    void testShowInOrder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(30);
        binaryTree.insert(20);
        binaryTree.insert(40);
        binaryTree.insert(10);
        binaryTree.insert(25);
        binaryTree.insert(35);
        binaryTree.insert(50);

        String result = captureOutput(binaryTree, "inorder");
        String expected = "10 20 25 30 35 40 50";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testShowPreOrder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(30);
        binaryTree.insert(20);
        binaryTree.insert(40);
        binaryTree.insert(10);
        binaryTree.insert(25);
        binaryTree.insert(35);
        binaryTree.insert(50);

        String result = captureOutput(binaryTree, "preorder");
        String expected = "30 20 10 25 40 35 50";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testShowPostOrder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(30);
        binaryTree.insert(20);
        binaryTree.insert(40);
        binaryTree.insert(10);
        binaryTree.insert(25);
        binaryTree.insert(35);
        binaryTree.insert(50);

        String result = captureOutput(binaryTree, "postorder");
        String expected = "10 25 20 35 50 40 30";

        Assertions.assertEquals(expected, result);
    }

    /**
     * Captura a saída do método de percurso da árvore binária.
     */
    private String captureOutput(BinaryTree binaryTree, String orderType) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        if (orderType.equals("inorder")) {
            binaryTree.showInOrder();
        } else if (orderType.equals("preorder")) {
            binaryTree.showPreOrder();
        } else if (orderType.equals("postorder")) {
            binaryTree.showPostOrder();
        }

        System.setOut(originalOut);
        return outputStream.toString().trim();
    }
}

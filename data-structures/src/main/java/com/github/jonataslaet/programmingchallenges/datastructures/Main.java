package com.github.jonataslaet.programmingchallenges.datastructures;

import com.github.jonataslaet.programmingchallenges.datastructures.generictree.GenericTree;
import com.github.jonataslaet.programmingchallenges.datastructures.generictree.Node;

public class Main {
    public static void main(String[] args) {

        GenericTree<String> myTree = new GenericTree<>();

        Node<String> root = myTree.add("Livro Azul", null);
        Node<String> intro = myTree.add("Introdução", root);
        Node<String> cap1 = myTree.add("Capítulo 1", root);
        Node<String> cap2 = myTree.add("Capítulo 2", root);

        myTree.add("Para quem é este livro", intro);
        myTree.add("Agradecimentos", intro);

        myTree.add("Conceitos", cap1);
        myTree.add("Aplicações", cap1);

        Node<String> cap2Sec1 = myTree.add("Métodos", cap2);
        myTree.add("Problema terreno", cap2);
        myTree.add("Problema carros", cap2);

        myTree.add("Método recursivo", cap2Sec1);
        myTree.add("Método imperativo", cap2Sec1);

        System.out.println("Size = " + myTree.getSize());
        System.out.println("isEmpty = " + myTree.isEmpty());

        Node<String> pos1 = myTree.getFoundNode("Livro Azul");
        Node<String> pos2 = myTree.getFoundNode("Capítulo 1");
        Node<String> pos3 = myTree.getFoundNode("Aplicações");

        System.out.println("\nLivro Azul:");
        if (pos1 != null) {
            System.out.println("Encontrado");
            System.out.println("isExternal: " + myTree.isExternal(pos1));
            System.out.println("isRoot: " + myTree.isRoot(pos1));
            Node<String> parent = myTree.getParent(pos1);
            if (parent != null) {
                System.out.println("parent: " + myTree.getElement(parent));
            }
        } else {
            System.out.println("NÃO encontrado");
        }

        System.out.println("\nCapítulo 1:");
        if (pos2 != null) {
            System.out.println("Encontrado");
            System.out.println("isExternal: " + myTree.isExternal(pos2));
            System.out.println("isRoot: " + myTree.isRoot(pos2));
            Node<String> parent = myTree.getParent(pos2);
            if (parent != null) {
                System.out.println("parent: " + myTree.getElement(parent));
            }
        } else {
            System.out.println("NÃO encontrado");
        }

        System.out.println("\nAplicações:");
        if (pos3 != null) {
            System.out.println("Encontrado");
            System.out.println("isExternal: " + myTree.isExternal(pos3));
            System.out.println("isRoot: " + myTree.isRoot(pos3));
            Node<String> parent = myTree.getParent(pos3);
            if (parent != null) {
                System.out.println("parent: " + myTree.getElement(parent));
            }
        } else {
            System.out.println("NÃO encontrado");
        }

        Node<String> pos4 = myTree.getFoundNode("Conceitos");
        myTree.replace(pos4, "Conceitos básicos");

        System.out.println("\nPRINT DFS PRE ORDER:");
        myTree.showTree();

        System.out.println("\nPRINT elements():");
        for (String elem : myTree.getElements()) {
            System.out.println(elem);
        }

        System.out.println("\nPRINT Nodes():");
        for (Node<String> pos : myTree.getNodes()) {
            System.out.println(myTree.getElement(pos));
        }

        System.out.println("\nPRINT BFS:");
        myTree.showTreeBFS(); //TODO: Pendente de implementação

        Node<String> pos5 = myTree.getFoundNode("Métodos");
        if (pos5 != null) {
            myTree.remove(pos5);
            System.out.println("\nPRINT remove:");
            System.out.println("SIZE = " + myTree.getSize());
            myTree.showTree();
        }
    }
}

package com.github.jonataslaet.programmingchallenges.datastructures;

import com.github.jonataslaet.programmingchallenges.datastructures.generictree.GenericTree;
import com.github.jonataslaet.programmingchallenges.datastructures.generictree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("ALL")
public class TestGenericTree {

    private GenericTree genericTree;

    @BeforeEach
    private void setUp() {
        this.genericTree = new GenericTree();
    }

    @Test
    void testGenericTreeIsEmptyInitially() {
        GenericTree genericTree = new GenericTree();
        Assertions.assertNull(genericTree.getFoundNode("10"));
    }

    @Test
    void testGenericTreeIsNotEmptyAfterInsertOneNode() {
        genericTree.add("Teste", null);
        Assertions.assertNotNull(genericTree.getFoundNode("Teste"));
    }

    @Test
    void testGenericTreeIsEmptyAfterInsertOneNodeAndRemovingIt() {
        Node<String> node = genericTree.add("Teste", null);
        genericTree.remove(node);
        Assertions.assertNull(genericTree.getFoundNode("Teste"));
    }

}

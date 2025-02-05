package com.github.jonataslaet.programmingchallenges.datastructures;

import com.github.jonataslaet.programmingchallenges.datastructures.stack.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStack {

    @Test
    void testStackIsEmptyInitially() {
        Stack stack = new Stack();
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    void testPushElementsToStack() {
        Stack stack = new Stack();
        stack.push("First Element");
        stack.push("Second Element");

        Assertions.assertFalse(stack.isEmpty());
        Assertions.assertEquals("Second Element", stack.peek());
    }

    @Test
    void testPeekElement() {
        Stack stack = new Stack();
        stack.push("First Element");
        stack.push("Second Element");

        Assertions.assertEquals("Second Element", stack.peek());
    }

    @Test
    void testPopElementsFromStack() {
        Stack stack = new Stack();
        stack.push("First Element");
        stack.push("Second Element");

        Assertions.assertEquals("Second Element", stack.pop());
        Assertions.assertEquals("First Element", stack.peek());
        Assertions.assertFalse(stack.isEmpty());

        Assertions.assertEquals("First Element", stack.pop());
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    void testPopSingleElementFromStack() {
        Stack stack = new Stack();
        stack.push("Only Element");

        Assertions.assertEquals("Only Element", stack.pop());
        Assertions.assertTrue(stack.isEmpty());
    }
}

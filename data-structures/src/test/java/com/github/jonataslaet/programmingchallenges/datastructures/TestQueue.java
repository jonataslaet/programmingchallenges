package com.github.jonataslaet.programmingchallenges.datastructures;

import com.github.jonataslaet.programmingchallenges.datastructures.queue.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQueue {

    @Test
    void testQueueIsEmptyInitially() {
        Queue<String> queue = new Queue<>();
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    void testAddElementsToQueue() {
        Queue<String> queue = new Queue<>();
        queue.add("First Element");
        queue.add("Second Element");

        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals("First Element", queue.peek());
    }

    @Test
    void testPeekElement() {
        Queue<String> queue = new Queue<>();
        queue.add("First Element");
        queue.add("Second Element");

        Assertions.assertEquals("First Element", queue.peek());
    }

    @Test
    void testRemoveElementsFromQueue() {
        Queue<String> queue = new Queue<>();
        queue.add("First Element");
        queue.add("Second Element");

        Assertions.assertEquals("First Element", queue.remove());
        Assertions.assertEquals("Second Element", queue.peek());
        Assertions.assertFalse(queue.isEmpty());

        Assertions.assertEquals("Second Element", queue.remove());
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    void testRemoveSingleElementFromQueue() {
        Queue<String> queue = new Queue<>();
        queue.add("Only Element");

        Assertions.assertEquals("Only Element", queue.remove());
        Assertions.assertTrue(queue.isEmpty());
    }
}

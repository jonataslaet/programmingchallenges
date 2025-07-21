package com.github.jonataslaet.programmingchallenges.datastructures;

import com.github.jonataslaet.programmingchallenges.datastructures.singlylinkedlist.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.github.jonataslaet.programmingchallenges.datastructures.singlylinkedlist.LinkedList;

public class TestLinkedList {


	@Test
	void testAddNodeToTheEnd() {
		String object1 = "Value Of Node 1";
		String object2 = "Value Of Node 2";

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(object1);
		linkedList.add(object2);

        Assertions.assertEquals(linkedList.getValue(0), object1);
        Assertions.assertEquals(linkedList.getValue(1), object2);
	}
	
	@Test
	void testAddNodeToThePosition() {
		String object1 = "Value Of Node 1";
		String object2 = "Value Of Node 2";
		String object3 = "Value Of Node 3";
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(object1);
		
		Assertions.assertTrue(linkedList.contains(object1));
		
		linkedList.add(0, object2);
		linkedList.add(1, object3);
		
		Assertions.assertTrue(linkedList.contains(object1));
		Assertions.assertEquals("Value Of Node 2", linkedList.getValue(0));
		Assertions.assertEquals("Value Of Node 3", linkedList.getValue(1));
		
	}
	
	@Test
	void testGetNodeFromPosition() {

		String object1 = "Value Of Node 1";
		String object2 = "Value Of Node 2";

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.addToTheBeginning(object1);
		linkedList.addToTheBeginning(object2);

		Node<String> nodeFromPosition0 = linkedList.get(0);
		Node<String> nodeFromPosition1 = linkedList.get(1);

		Assertions.assertNotNull(nodeFromPosition0);
		Assertions.assertNotNull(nodeFromPosition1);
		Assertions.assertEquals(linkedList.getValue(0), object2);
		Assertions.assertEquals(linkedList.getValue(1), object1);

	}

	@Test
	void testGetSize() {
		String object1 = "Value Of Node 1";
		String object2 = "Value Of Node 2";

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(object1);
		linkedList.add(object2);

		int expectedSize = 2;

		Assertions.assertEquals(expectedSize, linkedList.size());
	}

	@Test
	void testContainsNode() {
		String object1 = "Value Of Node 1";
		String object2 = "Value Of Node 2";
		String object3 = "Value Of Node 3";
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(object1);
		linkedList.add(object2);

		Assertions.assertTrue(linkedList.contains(object1));
		Assertions.assertTrue(linkedList.contains(object2));
		Assertions.assertFalse(linkedList.contains(object3));

	}

	@Test
	void testRemoveFromPosition() {
		String object1 = "Value Of Node 1";
		String object2 = "Value Of Node 2";
		String object3 = "Value Of Node 3";

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(object1);
		linkedList.add(object2);
		linkedList.add(object3);

        Assertions.assertEquals(3, linkedList.size());
		Assertions.assertTrue(linkedList.contains(object2));
		Assertions.assertEquals(object1, linkedList.getValue(0));
		Assertions.assertEquals(object2, linkedList.getValue(1));
		Assertions.assertEquals(object3, linkedList.getValue(2));
		linkedList.remove(1);
        Assertions.assertEquals(2, linkedList.size());
		Assertions.assertFalse(linkedList.contains(object2));
		Assertions.assertEquals(object1, linkedList.getValue(0));
		Assertions.assertNotEquals(object2, linkedList.getValue(1));
		Assertions.assertEquals(object3, linkedList.getValue(1));
	}

	@Test
	void testRemoveFromBegining() {
		String object1 = "Value Of Node 1";
		String object2 = "Value Of Node 2";

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(object1);
		linkedList.add(object2);

        Assertions.assertEquals(2, linkedList.size());
		Assertions.assertTrue(linkedList.contains(linkedList.getValue(0)));
		Assertions.assertEquals("Value Of Node 1", linkedList.getValue(0));
		linkedList.removeFromTheBeginning();
        Assertions.assertEquals(1, linkedList.size());
		Assertions.assertTrue(linkedList.contains(linkedList.getValue(0)));
		Assertions.assertEquals("Value Of Node 2", linkedList.getValue(0));
	}

	@Test
	void testRemoveFromTheEnding() {
		String object1 = "Value Of Node 1";
		String object2 = "Value Of Node 2";

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(object1);
		linkedList.add(object2);

        Assertions.assertEquals(2, linkedList.size());
		Assertions.assertTrue(linkedList.contains(object2));
		linkedList.removeFromTheEnding();
        Assertions.assertEquals(1, linkedList.size());
        Assertions.assertFalse(linkedList.contains(object2));
	}

	@Test
	void testAddNodeToTheBeginning() {
		String object1 = "Value Of Node 1";
		String object2 = "Value Of Node 2";

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.addToTheBeginning(object1);
		linkedList.addToTheBeginning(object2);

		String v1 = linkedList.getValue(0);
		String v2 = linkedList.getValue(1);

        Assertions.assertEquals(v1, object2);
        Assertions.assertEquals(v2, object1);
	}
}

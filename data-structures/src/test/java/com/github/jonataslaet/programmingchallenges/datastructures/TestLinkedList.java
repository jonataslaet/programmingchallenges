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

        Assertions.assertEquals(linkedList.get(0).getValue(), object1);
        Assertions.assertEquals(linkedList.get(1).getValue(), object2);
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
		Assertions.assertEquals("Value Of Node 2", linkedList.get(0).getValue());
		Assertions.assertEquals("Value Of Node 3", linkedList.get(1).getValue());
		
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
		Assertions.assertEquals(nodeFromPosition0.getValue(), object2);
		Assertions.assertEquals(nodeFromPosition1.getValue(), object1);

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
		Assertions.assertEquals(object1, linkedList.get(0).getValue());
		Assertions.assertEquals(object2, linkedList.get(1).getValue());
		Assertions.assertEquals(object3, linkedList.get(2).getValue());
		linkedList.remove(1);
        Assertions.assertEquals(2, linkedList.size());
		Assertions.assertFalse(linkedList.contains(object2));
		Assertions.assertEquals(object1, linkedList.get(0).getValue());
		Assertions.assertNotEquals(object2, linkedList.get(1).getValue());
		Assertions.assertEquals(object3, linkedList.get(1).getValue());
	}
	
	@Test
	void testRemoveFromBegining() {
		String object1 = "Value Of Node 1";
		String object2 = "Value Of Node 2";
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(object1);
		linkedList.add(object2);

        Assertions.assertEquals(2, linkedList.size());
		Assertions.assertTrue(linkedList.contains(linkedList.get(0).getValue()));
		Assertions.assertEquals("Value Of Node 1", linkedList.get(0).getValue());
		linkedList.removeFromTheBeginning();
        Assertions.assertEquals(1, linkedList.size());
		Assertions.assertTrue(linkedList.contains(linkedList.get(0).getValue()));
		Assertions.assertEquals("Value Of Node 2", linkedList.get(0).getValue());
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

		String v1 = linkedList.get(0).getValue();
		String v2 = linkedList.get(1).getValue();

        Assertions.assertEquals(v1, object2);
        Assertions.assertEquals(v2, object1);
	}
}

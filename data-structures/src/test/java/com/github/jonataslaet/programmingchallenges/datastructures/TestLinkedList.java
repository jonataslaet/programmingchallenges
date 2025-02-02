package com.github.jonataslaet.programmingchallenges.datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.github.jonataslaet.programmingchallenges.datastructures.Node;
import com.github.jonataslaet.programmingchallenges.datastructures.LinkedList;

public class TestLinkedList {


	@Test
	void testAddNodeToTheEnd() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");

		LinkedList linkedList = new LinkedList();
		linkedList.add(n1);
		linkedList.add(n2);

		Assertions.assertTrue(linkedList.get(0).getValue().equals(n1.getValue()));
		Assertions.assertTrue(linkedList.get(1).getValue().equals(n2.getValue()));
	}
	
	@Test
	void testAddNodeToThePosition() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");
		Node n3 = new Node(null, "Value Of Node 3");
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(n1);
		
		Assertions.assertTrue(linkedList.contains(n1));
		
		linkedList.add(0, n2);
		linkedList.add(1, n3);
		
		Assertions.assertTrue(linkedList.contains(n1));
		Assertions.assertEquals("Value Of Node 2", linkedList.get(0).getValue());
		Assertions.assertEquals("Value Of Node 3", linkedList.get(1).getValue());
		
	}
	
	@Test
	void testGetNodeFromPosition() {

		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");

		LinkedList linkedList = new LinkedList();
		linkedList.addToTheBeginning(n1);
		linkedList.addToTheBeginning(n2);

		Node nodeFromPosition0 = linkedList.get(0);
		Node nodeFromPosition1 = linkedList.get(1);

		Assertions.assertNotNull(nodeFromPosition0);
		Assertions.assertNotNull(nodeFromPosition1);
		Assertions.assertEquals(nodeFromPosition0.getValue(), n2.getValue());
		Assertions.assertEquals(nodeFromPosition1.getValue(), n1.getValue());

	}

	@Test
	void testGetSize() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");

		LinkedList linkedList = new LinkedList();
		linkedList.add(n1);
		linkedList.add(n2);
		
		int expectedSize = 2;
		
		Assertions.assertEquals(expectedSize, linkedList.size());
	}

	@Test
	void testContainsNode() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");
		Node n3 = new Node(null, "Value Of Node 3");
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(n1);
		linkedList.add(n2);

		Assertions.assertTrue(linkedList.contains(n1));
		Assertions.assertTrue(linkedList.contains(n2));
		Assertions.assertFalse(linkedList.contains(n3));

	}
	
	@Test
	void testRemoveFromPosition() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");
		Node n3 = new Node(null, "Value Of Node 3");
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(n1);
		linkedList.add(n2);
		linkedList.add(n3);
		
		Assertions.assertTrue(3 == linkedList.size());
		Assertions.assertTrue(linkedList.contains(n2));
		Assertions.assertEquals(n1.getValue(), linkedList.get(0).getValue());
		Assertions.assertEquals(n2.getValue(), linkedList.get(1).getValue());
		Assertions.assertEquals(n3.getValue(), linkedList.get(2).getValue());
		linkedList.remove(1);
		Assertions.assertTrue(2 == linkedList.size());
		Assertions.assertFalse(linkedList.contains(n2));
		Assertions.assertEquals(n1.getValue(), linkedList.get(0).getValue());
		Assertions.assertNotEquals(n2.getValue(), linkedList.get(1).getValue());
		Assertions.assertEquals(n3.getValue(), linkedList.get(1).getValue());
	}
	
	@Test
	void testRemoveFromBegining() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(n1);
		linkedList.add(n2);
		
		Assertions.assertTrue(2 == linkedList.size());
		Assertions.assertTrue(linkedList.contains(linkedList.get(0)));
		Assertions.assertEquals("Value Of Node 1", linkedList.get(0).getValue());
		linkedList.removeFromTheBeginning();
		Assertions.assertTrue(1 == linkedList.size());
		Assertions.assertTrue(linkedList.contains(linkedList.get(0)));
		Assertions.assertEquals("Value Of Node 2", linkedList.get(0).getValue());
	}
	
	@Test
	void testRemoveFromTheEnding() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(n1);
		linkedList.add(n2);
		
		Assertions.assertTrue(2 == linkedList.size());
		Assertions.assertTrue(linkedList.contains(n2));
		linkedList.removeFromTheEnding();
		Assertions.assertTrue(1 == linkedList.size());
		Assertions.assertTrue(!linkedList.contains(n2));
	}
	
	@Test
	void testAddNodeToTheBeginning() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");

		LinkedList linkedList = new LinkedList();
		linkedList.addToTheBeginning(n1);
		linkedList.addToTheBeginning(n2);

		String v1 = (String) linkedList.get(0).getValue();
		String v2 = (String) linkedList.get(1).getValue();
		
		Assertions.assertTrue(v1.equals(n2.getValue()));
		Assertions.assertTrue(v2.equals(n1.getValue()));
	}
}

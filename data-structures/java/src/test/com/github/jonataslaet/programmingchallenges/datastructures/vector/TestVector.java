package test.com.github.jonataslaet.programmingchallenges.datastructures.vector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.com.github.jonataslaet.programmingchallenges.datastructures.Node;
import main.com.github.jonataslaet.programmingchallenges.datastructures.Vector;

public class TestVector {


	@Test
	void testAddNodeToTheEnd() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");

		Vector<Node> vector = new Vector<Node>();
		vector.add(n1);
		vector.add(n2);

		Assertions.assertTrue(vector.get(0).getValue().equals(n1.getValue()));
		Assertions.assertTrue(vector.get(1).getValue().equals(n2.getValue()));
	}
	
	@Test
	void testAddNodeToThePosition() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");
		Node n3 = new Node(null, "Value Of Node 3");
		
		Vector<Node> vector = new Vector<Node>();
		vector.add(n1);
		
		Assertions.assertTrue(vector.contains(n1));
		
		vector.add(0, n2);
		vector.add(1, n3);
		
		Assertions.assertTrue(vector.contains(n1));
		Assertions.assertEquals("Value Of Node 2", vector.get(0).getValue());
		Assertions.assertEquals("Value Of Node 3", vector.get(1).getValue());
		
	}
	
	@Test
	void testGetNodeFromPosition() {

		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");

		Vector<Node> vector = new Vector<Node>();
		vector.add(n1);
		vector.add(n2);

		Node getN1 = (Node) vector.get(0);
		Node getN2 = (Node) vector.get(1);

		Assertions.assertNotNull(getN1);
		Assertions.assertNotNull(getN2);
		Assertions.assertEquals("Value Of Node 1", getN1.getValue());
		Assertions.assertEquals("Value Of Node 2", getN2.getValue());

	}

	@Test
	void testGetSize() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");

		Vector<Node> vector = new Vector<Node>();
		vector.add(n1);
		vector.add(n2);
		
		int expectedSize = 2;
		
		Assertions.assertEquals(expectedSize, vector.size());
	}
	
	@Test
	void testContainsNode() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");
		Node n3 = new Node(null, "Value Of Node 3");
		
		Vector<Node> vector = new Vector<Node>();
		vector.add(n1);
		vector.add(n2);

		Assertions.assertTrue(vector.contains(n1));
		Assertions.assertTrue(vector.contains(n2));
		Assertions.assertFalse(vector.contains(n3));

	}
	
	@Test
	void testRemoveFromPosition() {
		Node n1 = new Node(null, "Value Of Node 1");
		Node n2 = new Node(null, "Value Of Node 2");
		
		Vector<Node> vector = new Vector<Node>();
		vector.add(n1);
		vector.add(n2);
		
		Assertions.assertTrue(vector.contains(vector.get(0)));
		Assertions.assertEquals("Value Of Node 1", vector.get(0).getValue());
		vector.remove(0);
		Assertions.assertTrue(vector.contains(vector.get(0)));
		Assertions.assertEquals("Value Of Node 2", vector.get(0).getValue());
	}
}

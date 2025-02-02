package com.github.jonataslaet.programmingchallenges.datastructures.vector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.github.jonataslaet.programmingchallenges.datastructures.Node;
import com.github.jonataslaet.programmingchallenges.datastructures.Vector;

public class TestVector {


	@Test
	void testAddNodeToTheEnd() {
		Object object1 = "Value of object 1";
		Object object2 = "Value of object 2";

		Vector vector = new Vector();
		vector.add(object1);
		vector.add(object2);

		Assertions.assertTrue(vector.get(0).equals(object1));
		Assertions.assertTrue(vector.get(1).equals(object2));
	}
	
	@Test
	void testAddNodeToThePosition() {
		Object object1 = "Value of object 1";
		Object object2 = "Value of object 2";
		Object object3 = "Value of object 3";
		
		Vector vector = new Vector();
		vector.add(object1);
		
		Assertions.assertTrue(vector.contains(object1));
		
		vector.add(0, object2);
		vector.add(1, object3);
		
		Assertions.assertTrue(vector.contains(object1));
		Assertions.assertEquals("Value of object 2", vector.get(0));
		Assertions.assertEquals("Value of object 3", vector.get(1));
		
	}
	
	@Test
	void testGetObjectFromPosition() {

		Object object1 = "Value of object 1";
		Object object2 = "Value of object 2";

		Vector vector = new Vector();
		vector.add(object1);
		vector.add(object2);

		Object getObject1 = vector.get(0);
		Object getObject2 = vector.get(1);

		Assertions.assertNotNull(getObject1);
		Assertions.assertNotNull(getObject2);
		Assertions.assertEquals("Value of object 1", getObject1);
		Assertions.assertEquals("Value of object 2", getObject2);

	}

	@Test
	void testGetSize() {
		Object object1 = "Value of object 1";
		Object object2 = "Value of object 2";

		Vector vector = new Vector();
		vector.add(object1);
		vector.add(object2);
		
		int expectedSize = 2;
		
		Assertions.assertEquals(expectedSize, vector.size());
	}
	
	@Test
	void testContainsNode() {
		Object object1 = "Value of object 1";
		Object object2 = "Value of object 2";
		Object object3 = "Value of object 3";
		
		Vector vector = new Vector();
		vector.add(object1);
		vector.add(object2);

		Assertions.assertTrue(vector.contains(object1));
		Assertions.assertTrue(vector.contains(object2));
		Assertions.assertFalse(vector.contains(object3));

	}
	
	@Test
	void testRemoveFromPosition() {
		Object object1 = "Value of object 1";
		Object object2 = "Value of object 2";
		
		Vector vector = new Vector();
		vector.add(object1);
		vector.add(object2);
		
		Assertions.assertTrue(vector.contains(vector.get(0)));
		Assertions.assertEquals("Value of object 1", vector.get(0));
		vector.remove(0);
		Assertions.assertTrue(vector.contains(vector.get(0)));
		Assertions.assertEquals("Value of object 2", vector.get(0));
	}
}

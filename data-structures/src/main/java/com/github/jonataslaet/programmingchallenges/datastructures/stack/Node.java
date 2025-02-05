package com.github.jonataslaet.programmingchallenges.datastructures.stack;

public class Node {
	
	private Node next;
	private Object value;
	
	public Node(Object value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
}

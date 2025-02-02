package com.github.jonataslaet.programmingchallenges.datastructures;

public class Node {
	
	private Node next;
	private Object value;
	
	public Node(Node next, Object value) {
		this.next = next;
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

package com.github.jonataslaet.programmingchallenges.datastructures.queue;

public class Node<T> {
	
	private Node<T> next;
	private T value;

	protected Node(T value) {
		this.value = value;
	}

	protected Node<T> getNext() {
		return next;
	}

	protected void setNext(Node<T> next) {
		this.next = next;
	}

	protected T getValue() {
		return value;
	}

	protected void setValue(T value) {
		this.value = value;
	}
	
}

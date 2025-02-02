package com.github.jonataslaet.programmingchallenges.datastructures;

public class LinkedList {

	private Node first;
	private Node last;
	private int size;

	public void add(Node object) {
		if (size == 0) {
			this.addToTheBeginning(object);
		} else {
			Node node = new Node((this.last).getNext(), (object).getValue());
			((Node) this.last).setNext(node);
			this.last = node;
			size++;
		}
	}

	public void add(int position, Node object) {
		if (position == 0)
			this.addToTheBeginning(object);
		else if (position == this.size)
			this.add(object);
		else {
			Node previousNode = (Node) get(position-1);
			Node newNode = new Node(previousNode.getNext(), ((Node)object).getValue());
			previousNode.setNext(newNode);
		}
		this.size++;
	}

	public Node get(int position) {
		validOccupiedPosition(position);
		Node node = (Node) this.first;
		int i = 0;
		while (i < position && node.getNext() != null) {
			node = node.getNext();
			i++;
		}
		return node;
	}

	public void remove(int position) {
		if (position == 0) removeFromTheBeginning();
		else if (position == this.size - 1) removeFromTheEnding();
		else {
			Node previousNode = (Node) this.get(position-1);
			previousNode.setNext(previousNode.getNext().getNext());		
			this.size--;
		}
	}

	public boolean contains(Node object) {
		Node currentNode = this.first;
		while(currentNode != null) {
			if (currentNode.getValue().equals(object.getValue())) return true;
			currentNode = currentNode.getNext();
		}
		return false;
	}

	public int size() {
		return this.size;
	}

	public void addToTheBeginning(Node object) {
		Node node = new Node(this.first, object.getValue());
		this.first = node;
		if (this.size == 0) {
			this.last = this.first;
		}
		this.size++;
	}

	public void removeFromTheBeginning() {
		validOccupiedPosition(0);
		this.first = this.first.getNext();
		size--;
		if (size == 0) {
			this.last = null;
		}

	}

	public void removeFromTheEnding() {
		validOccupiedPosition(size -1);
		if (this.size == 1) {
			this.removeFromTheBeginning();
		} else {
			Node beforeLast = (Node) this.get(size - 2);
			beforeLast.setNext(null);
			this.last = beforeLast;
			this.size--;
		}
	}

	private boolean validPosition(int position) {
		return position >= 0 && position <= this.size;
	}

	private void validOccupiedPosition(int position) {
		if (!occupiedPosition(position)) {
			throw new IllegalArgumentException("Position without element");
		}
	}

	private boolean occupiedPosition(int position) {
		return position >= 0 && position < this.size;
	}
}

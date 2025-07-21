package com.github.jonataslaet.programmingchallenges.datastructures.singlylinkedlist;

public class LinkedList<T extends Comparable<T>> {

	private Node<T> first;
	private Node<T> last;
	private int size;

	public void add(T object) {
		if (size == 0) {
			this.addToTheBeginning(object);
		} else {
			Node<T> node = new Node<>(object);
			node.setNext((this.last).getNext());
			this.last.setNext(node);
			this.last = node;
			size++;
		}
	}

	public void add(int position, T object) {
		if (position == 0)
			this.addToTheBeginning(object);
		else if (position == this.size)
			this.add(object);
		else {
			Node<T> previousNode = get(position-1);
			Node<T> newNode = new Node<>(object);
			newNode.setNext(previousNode.getNext());
			previousNode.setNext(newNode);
		}
		this.size++;
	}

	public T getValue(int position) {
		return get(position).getValue();
	}

	public Node<T> get(int position) {
		validOccupiedPosition(position);
		Node<T> node = this.first;
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
			Node<T> previousNode = this.get(position-1);
			previousNode.setNext(previousNode.getNext().getNext());		
			this.size--;
		}
	}

	public boolean contains(T object) {
		Node<T> currentNode = this.first;
		while(currentNode != null) {
			if (currentNode.getValue().compareTo(object) == 0) return true;
			currentNode = currentNode.getNext();
		}
		return false;
	}

	public int size() {
		return this.size;
	}

	public void addToTheBeginning(T object) {
		Node<T> node = new Node<>(object);
		node.setNext(this.first);
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
			Node<T> beforeLast = this.get(size - 2);
			beforeLast.setNext(null);
			this.last = beforeLast;
			this.size--;
		}
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

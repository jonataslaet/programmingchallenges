package com.github.jonataslaet.programmingchallenges.datastructures;

@SuppressWarnings({ "unchecked", "unused" })
public class LinkedList<T> implements Operations<T> {

	private T first;
	private T last;
	private int currentQuantityOfElements;

	@Override
	public void add(T object) {
		if (currentQuantityOfElements == 0) {
			this.addToTheBeginning(object);
		} else {
			Node node = new Node(((Node) this.last).getNext(), ((Node) object).getValue());
			((Node) this.last).setNext(node);
			this.last = (T) node;
			currentQuantityOfElements++;
		}
	}

	@Override
	public void add(int position, T object) {
		if (position == 0)
			this.addToTheBeginning(object);
		else if (position == this.currentQuantityOfElements)
			this.add(object);
		else {
			Node previousNode = (Node) get(position-1);
			Node newNode = new Node(previousNode.getNext(), ((Node)object).getValue());
			previousNode.setNext(newNode);
		}
		this.currentQuantityOfElements++;
	}

	@Override
	public T get(int position) {
		validOccupiedPosition(position);
		Node node = (Node) this.first;
		int i = 0;
		while (i < position && node.getNext() != null) {
			node = node.getNext();
			i++;
		}
		return (T) node;
	}

	@Override
	public void remove(int position) {
		if (position == 0) removeFromTheBeginning();
		else if (position == this.currentQuantityOfElements-1) removeFromTheEnding();
		else {
			Node previousNode = (Node) this.get(position-1);
			previousNode.setNext(previousNode.getNext().getNext());		
			this.currentQuantityOfElements--;
		}
	}

	@Override
	public boolean contains(T object) {
		Node currentNode = (Node) this.first;
		while(currentNode != null) {
			if (currentNode.getValue().equals(((Node)object).getValue())) return true;
			currentNode = currentNode.getNext();
		}
		return false;
	}

	@Override
	public int size() {
		return this.currentQuantityOfElements;
	}

	public void addToTheBeginning(T object) {
		Node node = new Node((Node) this.first, ((Node) object).getValue());
		this.first = (T) node;
		if (this.currentQuantityOfElements == 0) {
			this.last = this.first;
		}
		this.currentQuantityOfElements++;
	}

	public void removeFromTheBeginning() {
		validOccupiedPosition(0);
		this.first = (T) ((Node) this.first).getNext();
		currentQuantityOfElements--;
		if (currentQuantityOfElements == 0) {
			this.last = null;
		}

	}

	public void removeFromTheEnding() {
		validOccupiedPosition(currentQuantityOfElements-1);
		if (this.currentQuantityOfElements == 1) {
			this.removeFromTheBeginning();
		} else {
			Node beforeLast = (Node) this.get(currentQuantityOfElements-2);
			beforeLast.setNext(null);
			this.last = (T) beforeLast;
			this.currentQuantityOfElements--;
		}
	}

	private boolean validPosition(int position) {
		return position >= 0 && position <= this.currentQuantityOfElements;
	}

	private void validOccupiedPosition(int position) {
		if (!occupiedPosition(position)) {
			throw new IllegalArgumentException("Position without element");
		}
	}

	private boolean occupiedPosition(int position) {
		return position >= 0 && position < this.currentQuantityOfElements;
	}
}

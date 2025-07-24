package com.github.jonataslaet.programmingchallenges.datastructures.vector;

public class Vector<T extends Comparable<T>> {

	private T[] objects;
	private int length;

	@SuppressWarnings("unchecked")
	public Vector() {
		this.objects = (T[]) (new Comparable[100]);
	}

	public void add(T object) {
		this.guaranteeSpace();
		this.objects[this.length++] = object;
	}

	public void add(int position, T object) {
		this.guaranteeSpace();
		if (!validPosition(position)) {
			throw new IllegalArgumentException("Invalid position");
		}
		for (int i = this.length; i > position; i--) {
			objects[i] = objects[i-1];
		}
		this.objects[position] = object;
		this.length++;
	}

	public T get(int position) {
		validOccupiedPosition(position);
		return this.objects[position];
	}

	public void remove(int position) {
		validOccupiedPosition(position);
		this.objects[position] = null;
		int idTheLast = this.length - 1;
		for (int i = position; i < idTheLast; i++) {
			this.objects[i] = this.objects[i+1];
		}
		this.length--;
	}

	public boolean contains(T object) {
		for (int i = 0; i < this.length; i++) {
			if (object.compareTo(objects[i]) == 0) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return this.length;
	}
	
	private boolean occupiedPosition(int position) {
		return position >= 0 && position < this.length;
	}
	
	private boolean validPosition(int position) {
		return position >= 0 && position <= this.length;
	}
	
	private void validOccupiedPosition(int position) {
		if (!occupiedPosition(position)) {
			throw new IllegalArgumentException("Position without element");
		}
	}
	
	@SuppressWarnings("unchecked")
	private void guaranteeSpace() {
		if (this.length == this.objects.length) {
			T[] newObjects = (T[]) new Object[2 * this.length];
			System.arraycopy(this.objects, 0, newObjects, 0, newObjects.length);
			this.objects = newObjects;
		}
	}
	
	public String toString() {
		if (this.length == 0) {
			return "[]";
		}
		int idTheLast = this.length - 1;
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < idTheLast; i++) {
			builder.append(this.objects[i]);
			builder.append(", ");
		}
		builder.append(this.objects[idTheLast]);
		builder.append("]");
		
		return builder.toString();
	}
}

package com.github.jonataslaet.programmingchallenges.datastructures.vector;

public class Vector {

	private Object[] objects = new Object[100];
	private int length;

	public void add(Object object) {
		// Add a certain node at the end of the list
		this.guaranteeSpace();
		this.objects[this.length++] = object;
	}

	public void add(int position, Object object) {
		// Add a certain node at the position of the list
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

	public Object get(int position) {
		// Get a certain object from a certain position of the list
		validOccupiedPosition(position);
		return this.objects[position];
	}

	public void remove(int position) {
		// Remove a certain node from a certain position of the list
		validOccupiedPosition(position);
		this.objects[position] = null;
		int idTheLast = this.length - 1;
		for (int i = position; i < idTheLast; i++) {
			this.objects[i] = this.objects[i+1];
		}
		this.length--;
	}

	public boolean contains(Object object) {
		// Verify if a certain node is in the list
		for (int i = 0; i < this.length; i++) {
			if (object.equals(objects[i])) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// Get the quantity of nodes in the list
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
			Object[] newObjects = new Object[2 * this.length];
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

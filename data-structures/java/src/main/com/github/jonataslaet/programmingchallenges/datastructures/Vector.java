package main.com.github.jonataslaet.programmingchallenges.datastructures;

public class Vector implements Operations {
	
	private Object[] objects = new Object[100];
	private int quantityOfObjects;

	public void add(Object object) {
		// Add a certain node at the end of the list
		this.guaranteeSpace();
		this.objects[this.quantityOfObjects++] = object;
	}

	public void add(int position, Object object) {
		// Add a certain node at the position of the list
		this.guaranteeSpace();
		if (!validPosition(position)) {
			throw new IllegalArgumentException("Invalid position");
		}
		for (int i = this.quantityOfObjects; i > position; i--) {
			objects[i] = objects[i-1];
		}
		this.objects[position] = object;
		this.quantityOfObjects++;
		
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
		int idTheLast = this.quantityOfObjects - 1;
		for (int i = position; i < idTheLast; i++) {
			this.objects[i] = this.objects[i+1];
		}
		this.quantityOfObjects--;
	}

	public boolean contains(Object object) {
		// Verify if a certain node is in the list
		for (int i = 0; i < this.quantityOfObjects; i++) {
			if (object.equals(objects[i])) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// Get the quantity of nodes in the list
		return this.quantityOfObjects;
	}
	
	private boolean occupiedPosition(int position) {
		return position >= 0 && position < this.quantityOfObjects;
	}
	
	private boolean validPosition(int position) {
		return position >= 0 && position <= this.quantityOfObjects;
	}
	
	private void validOccupiedPosition(int position) {
		if (!occupiedPosition(position)) {
			throw new IllegalArgumentException("Position without element");
		}
	}
	
	private void guaranteeSpace() {
		if (this.quantityOfObjects == this.objects.length) {
			Object[] newObjects = new Node[2 * this.quantityOfObjects];
			for (int i = 0; i < newObjects.length; i++) {
				newObjects[i] = this.objects[i];
			}
			this.objects = newObjects;
		}
	}
	
	public String toString() {
		if (this.quantityOfObjects == 0) {
			return "[]";
		}
		int idTheLast = this.quantityOfObjects - 1;
		
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

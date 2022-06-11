package main.com.github.jonataslaet.programmingchallenges.datastructures;

public class Vector implements Operations {
	
	private Node[] nodes = new Node[100];
	private int quantityOfNodes;

	public void add(Node node) {
		// Add a certain node at the end of the list
		this.nodes[this.quantityOfNodes++] = node;
	}

	public void add(int position, Node node) {
		// Add a certain node at the position of the list
		if (!validPosition(position)) {
			throw new IllegalArgumentException("Invalid position");
		}
		for (int i = this.quantityOfNodes; i > position; i--) {
			nodes[i] = nodes[i-1];
		}
		this.nodes[position] = node;
		this.quantityOfNodes++;
		
	}

	public Node get(int position) {
		// Get a certain node from a certain position of the list
		validOccupiedPosition(position);
		return this.nodes[position];
	}

	public void remove(int position) {
		// Remove a certain node from a certain position of the list
		validOccupiedPosition(position);
		this.nodes[position] = null;
		int idTheLast = this.quantityOfNodes - 1;
		for (int i = position; i < idTheLast; i++) {
			this.nodes[i] = this.nodes[i+1];
		}
		this.quantityOfNodes--;
	}

	public boolean contains(Node node) {
		// Verify if a certain node is in the list
		for (int i = 0; i < this.quantityOfNodes; i++) {
			if (node.equals(nodes[i])) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// Get the quantity of nodes in the list
		return this.quantityOfNodes;
	}
	
	private boolean occupiedPosition(int position) {
		return position >= 0 && position < this.quantityOfNodes;
	}
	
	private boolean validPosition(int position) {
		return position >= 0 && position <= this.quantityOfNodes;
	}
	
	private void validOccupiedPosition(int position) {
		if (!occupiedPosition(position)) {
			throw new IllegalArgumentException("Position without element");
		}
	}
	
	public String toString() {
		if (this.quantityOfNodes == 0) {
			return "[]";
		}
		int idTheLast = this.quantityOfNodes - 1;
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < idTheLast; i++) {
			builder.append(this.nodes[i]);
			builder.append(", ");
		}
		builder.append(this.nodes[idTheLast]);
		builder.append("]");
		
		return builder.toString();
	}
}

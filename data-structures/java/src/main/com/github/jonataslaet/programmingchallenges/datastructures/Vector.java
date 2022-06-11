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
		this.nodes[position] = node;
	}

	public Node get(int position) {
		// Get a certain node from a certain position of the list
		return this.nodes[position];
	}

	public void remove(int position) {
		// Remove a certain node from a certain position of the list
		this.nodes[position] = null;
	}

	public boolean contains(Node node) {
		// Verify if a certain node is in the list
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i] != null && node != null && node.equals(nodes[i])) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// Get the quantity of nodes in the list
		return this.quantityOfNodes;
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

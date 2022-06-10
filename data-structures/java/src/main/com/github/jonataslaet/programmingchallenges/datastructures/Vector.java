package main.com.github.jonataslaet.programmingchallenges.datastructures;

public class Vector {
	
	private Node[] nodes = new Node[100];
	private int quantityOfNodes;

	public void add(Node node) {
		// Add a certain node at the end of the list
	}

	public void add(int position, Node node) {
		// Add a certain node at the position of the list
	}

	public Node get(int position) {
		// Get a certain node from a certain position of the list
		return null;
	}

	public void remove(int position) {
		// Remove a certain node from a certain position of the list
	}

	public boolean contains(Node node) {
		// Verify if a certain node is in the list
		return false;
	}

	public int size() {
		// Get the quantity of nodes in the list
		return 0;
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

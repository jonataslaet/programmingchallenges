package com.github.jonataslaet.programmingchallenges.datastructures;

public interface Operations {
	//Add a certain node at the end of the list
	void add(Node node);
	
	//Add a certain node at the position of the list
	void add(int position, Node node);
	
	//Get a certain node from a certain position of the list
	Node get(int position);
	
	//Remove a certain node from a certain position of the list
	void remove(int position);
	
	//Verify if a certain node is in the list
	boolean contains(Node node);
	
	//Get the quantity of nodes in the list
	int size();
}

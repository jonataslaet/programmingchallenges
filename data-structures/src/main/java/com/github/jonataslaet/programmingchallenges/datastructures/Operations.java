package com.github.jonataslaet.programmingchallenges.datastructures;


public interface Operations<T> {
	//Add a certain object at the end of the list
	void add(T object);
	
	//Add a certain object at the position of the list
	void add(int position, T object);
	
	//Get a certain object from a certain position of the list
	T get(int position);
	
	//Remove a certain object from a certain position of the list
	void remove(int position);
	
	//Verify if a certain object is in the list
	boolean contains(T object);
	
	//Get the quantity of object in the list
	int size();
}

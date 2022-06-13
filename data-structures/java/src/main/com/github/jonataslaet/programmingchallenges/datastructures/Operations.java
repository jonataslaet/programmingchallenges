package main.com.github.jonataslaet.programmingchallenges.datastructures;


public interface Operations {
	//Add a certain object at the end of the list
	void add(Object object);
	
	//Add a certain object at the position of the list
	void add(int position, Object object);
	
	//Get a certain object from a certain position of the list
	Object get(int position);
	
	//Remove a certain object from a certain position of the list
	void remove(int position);
	
	//Verify if a certain object is in the list
	boolean contains(Object object);
	
	//Get the quantity of object in the list
	int size();
}

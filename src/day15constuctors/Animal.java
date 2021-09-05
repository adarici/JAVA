package day15constuctors;
/*
We use instance variables in constructors as parameters, 
because constructors a create objects
and they use object related variables which are instance variables.
We do not use class variables inside the constructors, 
because class variables are related with class
not with objects
*/
public class Animal {
	
	String name;
	int age;
	boolean isCarnivours;
	String specy;
	char gender;
	static int counter;
	
	public Animal() {
		counter++;
	}

	public Animal(String name, int age, boolean isCarnivours, String specy, char gender) {
		
		this.name = name;
		this.age = age;
		this.isCarnivours = isCarnivours;
		this.specy = specy;
		this.gender = gender;
		counter++;
	}
public Animal(String name, int age, char gender) {
	
	this.name = name;
	this.age = age;
	this.gender = gender;
	counter++;
}
/*
 1)this() is used for constructor call
 2) this () must be in the first line inside the constructor.
 3) in a constructor, how many times can "this ()" be used
 Answer: At most once. Because this() must be in the first line, 
 because in each constructor has single first line
 
 What is the difference between "this()" and just "this."?
 1) "this()" is used for constructor call, "this." use used for variable call.
 2)  "this()" can be used just once,"this."can be used many times.
 
 */
public Animal(String specy) {
	this("Bubby",5,'M');
	this.specy = specy;
	counter++;
}	
	
}

package day24multithreadsyncencapsulation;
/*
 1) In Java, there is parent-child relationship
 2) A parent can have infinitely many child classes.
 	A child can have just a single parent in Java. 
  	it means <java does not support multiple inheritance.
  3) Inheritance means child classes can use class members from parent class
  4) Inheritance is so beneficial in 
  a) Ending repetition 
  b) maintenance
  c) Re-usability
  5) A child class may have grandparents as well.
  
 */
/*
 1) Single inheritance: Child can have just have a single parent
 2) Hierarchical inheritance: A parent will have multiple child classes.
 3) Multi-level Inheritance: If a child has parent, grandparent, grand-grandparent...
 
 */

public class Animal {
	
	public void move() {
		System.out.println("Animals move...");
		
	}
	public void eat() {
		System.out.println("Animals eat...");
			
}
}
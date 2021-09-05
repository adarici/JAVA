package day26inheritanceoverriding;

public class Animal {
	/*
	 1- this()==> method used to call constructor in the same class
	 2- super()==> method used to call constructor from Parent class.
	 1- super () is used to called a specific constructor from parent class
	 2-	Typing "super()" or not typing, have same meaning
	 3- super () must be used in the first line in the constructor
	 4- super() can be used only once
	 5- super() can call constructors just from parent class not from grandparent class.
	 */
	String name = "Animal";
	int height = 34;
	byte ageOfAnimal = 3;
	
	public Animal(){
		System.out.println("Parent constructor ran...");
	}
	public Animal(String name){
		this();
		System.out.println("Parent constructor with paremeters ran...");
	}
	public void move() {
		System.out.println("Animals move...");
	}
	public void eat() {
		System.out.println("Animals eat...");
	}

}

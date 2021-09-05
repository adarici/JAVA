package day14methodoverloadingconstruction;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal a01 = new Animal();
		
		Animal a02 = new Animal("babby",7,"Bulldog");
		
		Animal a03 = new Animal(3,"Puppy");
		
		// If you want to look at the value of a class variable from an other class, 
		// use class name first then use variable name by putting "." between them.
		
		System.out.println(Animal.counter);
		
	}

}

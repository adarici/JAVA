package day29exceptionsabstraction;

public abstract class EAnimal {
	/*
	 * 1- abstract methods can be put in abstract classes.
	 * 2- abstract classes can have both a) abstract methods b) concrete methods
	 * 3-to create an abstract method a) put abstract keyword after access modifier
	 *                                b) do not put method body
	 * 4-for abstract methods we can use public, default, protected access modifiers
	 * but we can not use private access modifiers.
	 * 5-Abstract methods must be overridden by the child classes. 
	 * if you do not do that you will take compile time error  
	 * 6-just concrete child classes must override abstract methods 
	 * 7- we can not put abstract methods inside the concrete classes.                            
	 */
	public abstract void eat();
	
	public  void drinkWater() {
		
		System.out.println(" Animals drink water");
	}
}

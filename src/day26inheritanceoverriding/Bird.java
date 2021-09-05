package day26inheritanceoverriding;

public class Bird  extends Mammal {
	String name="Bird";
	int height = 11;
	byte ageOfBird= 1;
	public Bird() {
		super(3);
		
	System.out.println(super.ageOfAnimal);
	System.out.println(super.ageOfMammal);
	System.out.println(super.height);
	System.out.println(super.name);
	
	super.move();

		System.out.println("Child constructor ran...");
	}
	public void move() {
		System.out.println("Birds move...");
	}
	public void fly() {
		System.out.println("Birds fly...");
	}

}

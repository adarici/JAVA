package day26inheritanceoverriding;

public class Mammal extends Animal {
	String name = "Mammal";
	int height = 22;
	byte ageOfMammal=2;
	
	public Mammal(int height) {
		super();
		System.out.println(height+" cm.");
		
	}
	public void move() {
		System.out.println("Mammals move...");
	}
	public void fead() {
		System.out.println("Mammals fead their babies with milk...");
	}
}

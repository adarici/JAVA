package day30exceptionsinterfacesiteratorscollections;

public class Runnerday30 {

	public static void main(String[] args) {
		HondaCivic hc1 = new HondaCivic();
		hc1.eccelerate();
		hc1.climate();
		hc1.gasUsage();
		
		// there is a difference in usage, static method in a class and static methods in an interface.
		// To call a static method from an interface use "interface name"
		Music.volume();
		
		System.out.println(hc1.name);
		System.out.println(hc1.system);
		// if your parent interfaces have same variables
		System.out.println(Engine.price);
		System.out.println(Music.price);
		
		hc1.eat();
		
	}
	

}

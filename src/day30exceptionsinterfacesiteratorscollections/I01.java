package day30exceptionsinterfacesiteratorscollections;
/*
	1)interface is not a class, interface is an interface, thats it.
	2)interface is a storage for "abstract methods" and "public static final variables" 
	3)Normally we can store "abstract methods" and "public static final variables" in an "abstract class"
	  but abstract does not support multiple inheritance. Because of that Java created "interfaces" and interfaces 
	  can be used in multiple inheritance.
	4)interfaces do not have "constructors" because of that we cannot create objects from interfaces.
	5)All variables in an interface are automatically "public", "static", and "final"
		a)int x=12; and public int x=12; are completely same
*/

public interface I01 {

int x = 11;
public int y = 12;

//c variable is final automatically because of that we cannot change its value
char c = 'A';
//d is complaining because it is final and final variables must be initialized
//char d;
// You can access to ali can 
String s ="Ali Can";

int m =14;
public static final int u=14; 


// Methods

 void add(int x, int y);

abstract void div(int x, int y);

// Until Java9 using concrete 
// 1. way to concrete 
default void product(int x, int y) {
	System.out.println("Result; "+x*y);
	
	//2. Way
	
	
	}
	static void subtract(int x1, int y1) {
		System.out.println("Result; "+(x1-y1));
}
}
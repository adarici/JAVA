package day13loops;

public class MethodCreation01 {
	/*
 	If a method is static everything inside the method must be static
 */
	public static void main(String[] args) {
		System.out.println(add(3,5));
		System.out.println(add(13,15));
		System.out.println(add(31,51));
		System.out.println(add(30,50));
		// The value you used when you call a method are called "arguments"
		System.out.println(multiply(3,2,4));

	}
	/*
 	If you want to create method whose names are same inside a class, you have to make parameters different.
 	1)Make the data types of parameters different
 	2)Make the number of parameters different
 	3)If the data type of parameters are different, you can change the order of parameters
 	
 	Note: If you create methods whose a)names are same, b)parameters are different c)in the same class, this called
 	      "Method Overloading".
 	      
 	Note: In method overloading
 		  a)Using different return types does not work
 		  b)Using different access modifiers does not work
 		  c)Using different parameter names does not work
 		  
    Note: For Java, to make the methods different, just a)method name and b)parameters are important.
          Because of that method name + parameters are called "Method Signature"
 */

	// Create a method and used it inside the main method
	
	public static int add(int a, int b) {
		return a+b;
		
	}
	// Create a method which multiplies 3 integers, the call the method from main method
	//The variables created inside the method parathesis like x,y,z are called "parameters"
public static int multiply(int x,int y, int z) {
	return x*y*z;
}
}

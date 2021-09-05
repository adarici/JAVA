package day22dateaccessmodifiers;

import day01variables.AccessModifiers05;
import day20arraylists.AccessModifiers03;

public class AccessModifiers02 {
	
	public static void main(String[] args) {
		/*
		 * how can we access variables from another class
		 * 1- if it is static we can call it y class name
		 * 2-if it is not static we can call it by creating object
		 */
		/*
		 * 1- public
		 * 2-default
		 * 3-protected
		 * 4-private
		 */
		
		AccessModifiers01 obj1 = new AccessModifiers01();
		System.out.println(obj1.qa);
		
		System.out.println(AccessModifiers01.qa1);
		System.out.println(AccessModifiers01.qa2);
		
		/*
		 * we can access public variables from anywhere
		 * we can not access private variables from outside of the class
		 */
		//System.out.println(obj1.qa3);
		
		System.out.println(obj1.qa4);
		/*
		 * we can not call default ones from another package. They should be inside the same package to work with them
		 */
		//AccessModifiers03 obj2 = new AccessModifiers03();
		//System.out.println(obj2.email); doesn't import because of not being static.
		
		// Note: if you change as "public static String qa3 = "ZERRIN"; 
		// means "static" then doesn't matter where ever you want, you can call
		System.out.println(AccessModifiers03.qa3);//from day20arraylist package.
		System.out.println(AccessModifiers05.qa5);// from day01variables package.
	
	}

}

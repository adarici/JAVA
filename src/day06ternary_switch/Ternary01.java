package day06ternary_switch;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int x = scan.nextInt();
		// Condition   ?   Code  executed for true condition  : Code  executed for false condition
		
		//String result=   x<5   ?   "True"    :   "False"; 
		
		//String result=x%2 ==0  ?  (x + " is even") : (x + " is odd");
		//System.out.println(result);
		
		// if ternary returns different data types, 
		//do not create a container put it into System.outprintln() directly.
		// System.out.println(x++ >5 ? "true" : x); 
		
		// If you have to create a container for the ternary result, 
		// you have to make data types same.
		scan.close();
		String result = x++ >5 ? "true" : x+"";
		System.out.println(result);
		
	}
	
}

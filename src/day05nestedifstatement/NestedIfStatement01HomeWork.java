package day05nestedifstatement;

import java.util.Scanner;

public class NestedIfStatement01HomeWork {

	public static void main(String[] args) {
		/*
		 1) Type java code by using nested if statement.
		 	If a number is even then check if it is divisible by 3 or not.
		 	If divisible by 3 the output will be "Perfect even number" 
		 	otherwise  the output will be "Good even number".
		 	If the number is odd then check if it is divisible by 3 or not.
		 	If divisible by 3 the output will be "Perfect odd number" 
		 	otherwise  the output will be "Good odd number".
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, enter a number to check even or odd...");
		
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println("Perfect even number");
		}else { 
			System.out.println("Good even number");
		}if(num%3==0) {
			
		}else {
			System.out.println("Good odd number");
		} scan.close();
	} 

}

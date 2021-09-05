package day06ternary_switch;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer. 
		 If the number has 3 digits, output will be  
		“This number has 3 digits.” Otherwise, 
			output will be “This number has no 3 digits.”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer...");
		
		int a = scan.nextInt();
		int b = Math.abs(a);
		scan.close();
		String result = b>99 && b<1000 ? a+" This number has 3 digits":a+" This number has not 3 digits";
	System.out.println(result);
	
	} 
	
}

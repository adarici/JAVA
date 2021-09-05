package day03increment_decrement_operators;

import java.util.Scanner;

public class Modulos01HomeWork {

	public static void main(String[] args) {
		/*
		 1) Type a program like; 
			Ask user to enter two integer values, the first will be greater than 
			the second. 
			The remainder when you divide the first by the second will be the width, 
			and the sum of the two numbers will be the length of a rectangle. 
			Then calculate the area and the parameter of the rectangle, and print them 
			on the console.
		 */
		int num1 = 5;
		int num2 = 3;
		int remainder = num1%num2;
		System.out.println("Reminder;" + remainder);
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two integer values, the first will be greater than the second.");
		
		int num5 = scan.nextInt();
		int num6 = scan.nextInt();
		
		int remainder1 = num5%num6;
		System.out.println("Width:" + remainder1);
		
		System.out.println("length:" + num5+num6);
		
	scan.close();
	} 
}



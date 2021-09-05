package day06ternary_switch;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 Type java code by using ternary and if-else. 
		 Ask user to enter two integers
		Write a program to print the minimum one on the console.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers...");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		// 1. Way: use if else
		if (a<b) {
			System.out.println("The minimum " + a);
		}else {
			System.out.println("The minimum "+b);
		}
scan.close();
		
		//2. Way use ternary
	int num = a<b ? a : b;
	System.out.println("The minimum "+num );
	
	}
	
}

package day04if_ifelse_elseif;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		// Get a integer from user, then tell the number even or odd
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println(num+" is even");
		}
		if (num%2!=0)	{
			System.out.println(num+ " is odd");
		}
		if(num>=0) {
			System.out.println(num + " not negative");
		}
		
		if (num<0) {
			System.out.println(num + " negative");
		}
		//Get the length and the height of a rectangle from user, 
		//if the equal to each other,
		// print "Square" on the console, otherwise "Rectangle" on the console.
		
		System.out.println("Enter the width and length..");
		double w = scan.nextDouble();
		double l = scan.nextDouble();
		if(w<0||l<0) {
			System.err.println("For width and length use positive values..");
		}
		if(w==l) {
			System.out.println("Square");
		}
		if(w!=l) {
			System.out.println("Rectangle");
		}
		scan.close();
	}

}

package day13loops;

import java.util.Scanner;

public class ReviewWhileLoop03 {

	public static void main(String[] args) {
		/*
		 Type a java code by using while loop
		 Write a program that prompts the user to print a positive integer.
		 It should be then print the multiplication table of that number.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println(" Enter an integer");
		int num = scan.nextInt();
		
		int i =1;
		while(i<11) {
			System.out.println(num+"x"+i+"=" + num*i);
			i++;
	}
}
}

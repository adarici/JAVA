package workshopday02;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Get a number from the user and write a program 
		 * that prints half the cube of the number to the console.
		 * 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println(" Enter a number");
		
		double num=scan.nextDouble();
		//double cube = num*num*num;
		double cube=Math.pow(num, 3);
		 System.out.println(cube/2);
		scan.close();
	}

}

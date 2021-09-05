package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;


public class Scanner04Review {

	public static void main(String[] args) {
		/*
		  	Type a program which calculates the area and the perimeter of a square 
        whose side length is entered by user.
        a ==> Area: a*a
        a ==> Perimeter: 4*a 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Hey user, enter the side length to calculate Area and Paremiter of a square");
		double side = scan.nextDouble();
		System.out.println("Area:"+side*side);
		System.out.println("Parameter:"+ (4*side));
		

	}

}

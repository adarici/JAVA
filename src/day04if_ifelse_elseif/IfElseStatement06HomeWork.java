package day04if_ifelse_elseif;

import java.util.Scanner;

public class IfElseStatement06HomeWork {

	public static void main(String[] args) {
		/*
		 6) Type java code by using if-else statement, 
		Write a program to print absolute value of a number entered by user.
		Absolute Value: If the number is positive or zero return the number itself
 		If the number is negative return the number after multiplying by -1
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, enter a number..");
		
		double num = scan.nextDouble();
		if(num>=0) {
			System.out.println(num);
		}else {
			System.out.println(num*-1);
		}
		scan.close();
	}

}

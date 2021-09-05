package day04if_ifelse_elseif;

import java.util.Scanner;

public class IfElseStatement05HomeWork {

	public static void main(String[] args) {
		/*
		 5)Type java code by using if-else statement, 
			if the password is “JavaLearner”, output will be “The password is true”. 
			Otherwise, output will be “The password is false”.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, enter the password");
		
		String str = scan.next();
		if (str.equals("JavaLearner")) {
			System.out.println("The password is true.");
		}else {
			System.err.println("The password is false");
		}
		scan.close();
	}

}

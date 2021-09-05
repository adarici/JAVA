package day04if_ifelse_elseif;

import java.util.Scanner;

public class IfElseStatement02HomeWork {

	public static void main(String[] args) {
		/*
		 2)Ask user to enter his/her age and gender. 
		 	If the age is more than 65 and the gender is male 
			then output will be “Hey man you retired!” 
			else output will be “No need to work”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, enter your age and gender...");
		int age = scan.nextInt();
		String gender = scan.next("male");
		
		if(age>65&&gender.equals("male")) {
		System.out.println("Hey man you retired!");
	}else {
		System.out.println("No need to work");
	}
		scan.close();
	}
}
		
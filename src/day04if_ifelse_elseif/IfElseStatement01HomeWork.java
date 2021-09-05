package day04if_ifelse_elseif;

import java.util.Scanner;

public class IfElseStatement01HomeWork {

	public static void main(String[] args) {
		/*
		 1) Ask user to enter his/her age. 
		 	If the age is between 18 and 65 then output will be “You should work”, 
			else output will be “No need to work”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age...");
		
		int age = scan.nextInt();
		
		if(age>17 && age<66) {
			System.out.println("You should work");
			
		}else {
			System.out.println("No need to work");
		}
		scan.close();
	}

}

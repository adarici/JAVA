package day04if_ifelse_elseif;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// Get the name from user, then tell to the user if it is week day or weekend day
		Scanner scan = new Scanner (System.in);
		System.out.println(" Enter the name of the day in lowercase..");
		
		String day = scan.next();
		
		/*
		 	1)“==” ==> Checks a)values and b)addresses. 
		 			If both are same it returns true otherwise it returns false
		 	2)“equals()” ==> Checks just the values by NOT Ignoring Cases.
		 	3)“equalsIgnoreCase()” ==> Checks just the values by ignoring cases
		 */
		
		if(day.equalsIgnoreCase("sunday")||day.equalsIgnoreCase("saturday")) {
			System.out.println(day + " is weekend day");
		}else {
			System.out.println(day+ " is week day");
		}
		scan.close();	
	}

}

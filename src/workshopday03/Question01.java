package workshopday03;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 *  Ask user Name, Surname and credit card numbers 
		 *  than convert it to special form. 
		 *  (Initials for name and surname should be uppercase)
(Check credit card number, if there aren’t 16 digit print 
“Invalid credit card number”
Input :
John White 1234234534561478
Output :
Name : J*** W****
CCN  : **** **** **** 1478
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your name");
		String name= scan.next();
		
		System.out.println("Enter your surname");
		String surname= scan.next();
		
		System.out.println("Enter your ccn number");
		String ccn= scan.next();
		
		if(ccn.length()!=16) {
			System.out.println("Invalid credit card number");
			
		}
		String rename=name.substring(0,1).toUpperCase()+name.substring(1).replaceAll("\\w","*");
		System.out.println(rename);
	
		String reSurname=surname.substring(0,1).toUpperCase()+surname.substring(1).replaceAll("\\w","*");
		System.out.println(reSurname);
		
		String ccn1= ccn.substring(0, 12).replaceAll("\\d", "*")+ccn.substring(12);
		System.out.println(ccn1);
		
		System.out.println("**** **** **** "+ccn.substring(12));
		scan.close();
	}

}

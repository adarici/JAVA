package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner01HomeWork10 {

	public static void main(String[] args) {
		/*
		  Type a program which asks user to enter his/her full name, and address 
			then print them on the console like the full name should be in the first line, 
			and the address will be in the second line. 
			Hint: To get String, use nextLine()
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter your first and last names, adrerss");
		
		String firstName = scan.nextLine();
		String lastName = scan.nextLine();
		String adress = scan.next();
		System.out.println(firstName + " " + lastName);
		System.out.println(adress);
		
	

	}

}

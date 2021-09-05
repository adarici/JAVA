package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner03Review {

	public static void main(String[] args) {
		// Hey user, enter a number to calculate its cube...
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey user, enter a number to calculate its cube...");
		double num = scan.nextDouble();
		System.out.println(num*num*num);
		
		
		

	}

}

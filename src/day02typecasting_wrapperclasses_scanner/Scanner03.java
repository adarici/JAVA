package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Hey user, enter a number to calculate its cube...");
		double number = scanner.nextDouble();
		System.out.println(number*number*number);
		
		

	}

}

package day29exceptionsabstraction;

import java.util.Scanner;

public class EE01 {

	public static void main(String[] args) {
		/*
		 * 1-we can use throws in method signature we can use throw inside the method
		 * body wherever we want. 
		 * 2- after throws keyword you can type more than one
		 * exception but when you use throw keyword you should type throw for every
		 * exception. 
		 * 3-with throws keyword we use the name of the exception with throw
		 * keyword we use object.
		 * 
		 */

		// IllegalArgumentException
		//unchecked exception. When we do not want some kind of entries for our code.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scanner.nextInt();

		try {
			setAge(age);
		} catch (IllegalArgumentException e) {
			System.out.println("Please do not enter negative value for your age");
		}
scanner.close();
	}

	public static void setAge(int age) throws IllegalArgumentException {
		if (age < 0) {
			throw new IllegalArgumentException();
		} else {
			System.out.println("Your age is: " + age);
		}
	

	}
}

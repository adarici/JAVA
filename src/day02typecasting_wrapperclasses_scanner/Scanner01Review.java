package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner01Review {

	public static void main(String[] args) {
		/*
	 	1)To get data from user we need to use "Scanner Class" in Java
	 	2)To be able to use "Scanner Class"
	 		a)Create an object from "Scanner Class"
	 			ClassName -> ObjectName -> "=" -> "new" -> ClassName();
	 		b)By using the object access to the methods and use them
	*/
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Hey user, enter your age..");
		
		int age = scanner.nextInt();
		
		System.out.println(age);
		
		
		
		
		
		

	}

}

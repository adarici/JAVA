package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner02Review {

	public static void main(String[] args) {
		//Create Scanner Object
		
		//Give message to user
				
		//Create a container to store data coming from user
		
		//Note: To get String data from user, you have nextLine() and next() methods.
		//nextLine() takes all String, but next() takes just the first word.

		//Print the name on the console
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Hey user, your firstname, last name and adress");
		String firstName = scanner.nextLine();
		System.out.println(firstName);
		String lastName = scanner.nextLine();
		System.out.println(lastName);
		String adress = scanner.next();
		System.out.println(adress);
		
		
		
		
	}

}

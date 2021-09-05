package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner08Review {

	public static void main(String[] args) {
		/*
		 *Type a program which converts the hours to seconds. Hours value will be
			entered by user. (Use long)
			Hint 1: second = hour x 60 x 60
		 */
		Scanner scan = new Scanner(System.in);
		long hour = scan.nextLong();
		System.out.println(hour*60*60+"sec");
	}

}

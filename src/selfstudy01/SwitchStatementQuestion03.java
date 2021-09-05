package selfstudy01;

import java.util.Scanner;

public class SwitchStatementQuestion03 {

	public static void main(String[] args) {
		/*
		 * Type java code by using switch statement. 
			A school has following rules for grading system: 
			1. For 50 - C 2. For 80 - B. 4. For 100 - A 
			Ask user to enter marks and print the corresponding grade.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, enter your note...");
		
		int num = scan.nextInt();
		
		switch (num) {
		case 50:
			System.out.println("C");
			break;
		case 80:
			System.out.println("B");
			break;
		case 100:
			System.out.println("A");
			break;

		default:
			System.err.println("Not a valid note");
			break;
		}scan.close();

	}

}

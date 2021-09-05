package day25encapsulationsndinterviewquestions;

import java.util.Scanner;

public class ReviewOfQuestion03 {

	public static void main(String[] args) {
		// Ask a String from user with spaces 
		//and Write codes in a method that removes spaces in a String

		Scanner scan = new Scanner (System.in);
		System.out.println("Pls, enter a string with spaces...");
		
		String str = scan.nextLine();
		removeSpaces(str);
		scan.close();
	}		
public static void removeSpaces(String str) {
	System.out.println(str.replaceAll("\\s", ""));
}
}

package day10loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter A String
		 * Check if the String is Palindrome or not
		 * Palindrome ==> anna <==>anna
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine();
		String reversed = "";
		
		// Reverse String
		for(int i =s.length()-1; i>=0; i--) {
			
			reversed=reversed+s.charAt(i);
			
		}
		if (s.equalsIgnoreCase(reversed)) {
			System.out.println(s+" is palindrome");
			
		}else {
			System.out.println(s+" is not palindrome");
			scanner.close();
		}
		
	}

}

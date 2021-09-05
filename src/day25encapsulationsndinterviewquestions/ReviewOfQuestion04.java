package day25encapsulationsndinterviewquestions;

import java.util.Scanner;

public class ReviewOfQuestion04 {

	public static void main(String[] args) {
		//Create a program checks if a string is palindrome or not
		Scanner scan = new Scanner (System.in);
		System.out.println("Pls, enter a String to check Palindrome or not...");
		String str = scan.nextLine().replaceAll("\\s", "").toLowerCase();
		isPalindrome(str);
	}
	public static void isPalindrome(String str) {
		String revString="";
		
		for (int i = str.length()-1; i>=0; i--) {
			revString+=str.charAt(i);
		}
		
		if (str.equals(revString)) {
			System.out.println("String is a Palindrome");
		} else {
			System.out.println("String is not a Palindrome");

		}
	}

	}


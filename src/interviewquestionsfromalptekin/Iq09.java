package interviewquestionsfromalptekin;

import java.util.Scanner;

public class Iq09 {
/*
 Find the longest Palindrome
 
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String ....");
		String str = scan.nextLine();
		
		findTheLongestPalindrome(str);
	}
	public static void findTheLongestPalindrome(String str) {
		StringBuilder strB = new StringBuilder(str);
		System.out.println("Original String "+strB);
		
		StringBuilder strBuilderToReverse = new StringBuilder(str);
		strBuilderToReverse.reverse();
		System.out.println("Reversed String "+strBuilderToReverse);
		
		for (int i = 0; i < strBuilderToReverse.length(); i++) {
			
			if(strB.charAt(i)!=strBuilderToReverse.charAt(i) ) {
				strBuilderToReverse.replace(i, i+1, "");
				i--;
			}
		}
		System.out.println("The longest Palindrome "+strBuilderToReverse);
		
	}

}

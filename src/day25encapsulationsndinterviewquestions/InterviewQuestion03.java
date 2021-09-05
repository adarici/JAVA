package day25encapsulationsndinterviewquestions;

import java.util.Scanner;

public class InterviewQuestion03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a String with spaces");
		
		String str = scan.nextLine();
		removeSpaces(str);
		scan.close();
	}
	public static void removeSpaces(String str) {
		System.out.println(str.replaceAll("\\s", ""));
	}

}

package day04if_ifelse_elseif;

import java.util.Scanner;

public class IfElseStatement03HomeWork {
	public static void main(String[] args) {
		/*
		 3) Ask user to enter a character, 
		 then check whether the character is alphabet or not
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, Enter a character");
		
		char character = scan.next().charAt(0);
		
		if (character>'a'&& (character<'z')) {
			System.out.println("Alphabet");
		}else {
			System.err.println(" not alphabet");
		}
		scan.close();
	}

}

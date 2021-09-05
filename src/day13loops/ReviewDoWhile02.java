package day13loops;

import java.util.Scanner;

public class ReviewDoWhile02 {

	public static void main(String[] args) {
		 /*
		 Ask user to enter his/her first name
		 If the initial is lower case print a massage like 
		 "Make the initial upper case"
		 If the initial is upper case print a massage like 
		 "You did it right"
		 */
		
		Scanner scan = new Scanner (System.in);
		char initial ='!';
		do {
			System.out.println("Enter your first name");
		initial=scan.next().charAt(0);
		
		if (initial>='a'&& initial<='z') {
			System.err.println("Make the initial upper case");
		}
		}while(initial>='a'&& initial<='z');
		System.out.println(" You did it...");
		scan.close();
	}
}



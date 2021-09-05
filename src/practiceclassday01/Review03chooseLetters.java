package practiceclassday01;

import java.util.Scanner;

public class Review03chooseLetters {

	public static void main(String[] args) {
		/*
		  * Ask user to choose one of these letters : A , B , C
		 * If they choose A, print: Java is easy
		 * If they choose B, print: Java is fun
		 * If they choose C, print: I need to study :)
		 *
		 * EXAMPLE: INPUT : A OUTPUT :Java is easy
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, choose one of these letters : A , B , C");
		
		char l = scan.next().toUpperCase().charAt(0);
		
		switch(l) {
			case 'A':
				System.out.println("Java is easy");	
				break;
			case 'B':
				System.out.println("Java is fun");
				break;
			case 'C':
				System.out.println("I need to study");
				break;
	
		default:
					System.err.println("Only one of these letters pls");
				break;
		
	}scan.close();
	}

}

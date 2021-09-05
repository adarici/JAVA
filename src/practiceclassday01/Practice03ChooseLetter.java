package practiceclassday01;

import java.util.Scanner;

public class Practice03ChooseLetter {

	public static void main(String[] args) {
		/*
		  * Ask user to choose one of these letters : A , B , C
		 * If they choose A, print: Java is easy
		 * If they choose B, print: Java is fun
		 * If they choose C, print: I need to study :)
		 *
		 * EXAMPLE: INPUT : A OUTPUT :Java is easy
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter one of these letters. \nA\nB\nC");
		char l = scan.next().toUpperCase().charAt(0);
		
		switch (l) {
		case'A':
		System.out.println("Java is easy");
			break;
		case'B':
			System.out.println("Java is fun");
				break;
		case('C'):
			System.out.println("I need to study Java");
				break;
		
	default:
			System.out.println("Only these letters");
			break;
	
		}scan.close();
		
		

	}

}

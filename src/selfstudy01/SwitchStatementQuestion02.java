package selfstudy01;

import java.util.Scanner;

public class SwitchStatementQuestion02 {

	public static void main(String[] args) {
		/*
		 * Write a Java program user will choose answer among A, B, C, or D. 
 			If the answer is true, output will be “True.” 
 			If the answer is false, output will be 
			“False”. Correct answer is ‘C’ for the multiple option question.
2
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, enter one of the these letters A,B,C, or D.");
		
		char l = scan.next().toUpperCase().charAt(0);
		
		 switch (l) {
		case 'A':
			System.out.println("false");
			break;
		case 'B':
			System.out.println("false");
			break;
		case 'C':
			System.out.println("true");
			break;
		case 'D':
			System.out.println("false");
			break;

		default:
			System.err.println("Not in options");
			break;
		}scan.close();

	}

}

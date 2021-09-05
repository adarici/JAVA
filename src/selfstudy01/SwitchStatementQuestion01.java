package selfstudy01;

import java.util.Scanner;

public class SwitchStatementQuestion01 {

	public static void main(String[] args) {
		/*
		 if the user pressed 1, 2, 3 
		 the program will print the number that is pressed;
		otherwise, program will print "Not allowed".
1
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls enter 1,2,3");
		
		int num1 = scan.nextInt();
		
		
		  switch (num1) {
		case 1:
			System.out.println("1");
			break; 
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;

		default:
			System.out.println("Not allowed");
			break;
		}
		scan.close();
		
	}

}

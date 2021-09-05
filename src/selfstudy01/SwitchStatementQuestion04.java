package selfstudy01;

import java.util.Scanner;

public class SwitchStatementQuestion04 {

	public static void main(String[] args) {
		/*
		 *Ask user to enter one of the ‘U’, ’S’, and ‘A’. 
		Then type a program by using “switch statement” to print “United” 
		for ‘U’ ”States” for ’S’, and “America” for ‘A’
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Pls, enter these letters by ther order as U,S,A");
		
	char l = scan.next().toUpperCase().charAt(0);
	switch (l) {
	
	case 'U':
		System.out.println("United");
		break;
	case 'S':
		System.out.println("States");
		break;
	case 'A':
		System.out.println("America");
		break;

	default:
		System.err.println("Not a valid letter");
		break;
	}
	scan.close();
	}

}

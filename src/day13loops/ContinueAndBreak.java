package day13loops;

import java.util.Scanner;

public class ContinueAndBreak {

	public static void main(String[] args) {
		/*
		 continue==> is used to skip some values in a loop
		 if you execute "continue" it take you to the increment part
		 break==> is used to end the loop
		 */
		/*
		 Print all integers from 1 to 11 except 7 and 9
		 */
		
		for(int i = 1; i<12; i++) {
			if(i==7||i==9) {
				continue;
			}
			System.out.print(i+" ");
		}
		/*
		 Ask user to enter integers 
		 Go on to ask to enter integers until user enters 11
		 */
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("Enter an integer");
			int n = scan.nextInt();
			if (n==11) {
				break;
			}else {
				System.out.println(n+" ");
			}
		}while(true);
		System.out.println(" You stepped on the mine, you died");
		scan.close();
	}

}

package day13loops;

import java.util.Scanner;

public class ReviewDoWhile01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer
		 If the integer is even print on the console "You Won"
		 Otherwise ask an other integer
		 */
		 Scanner scan = new Scanner (System.in);
		 
		 int num = 0;
		 do {
			 System.out.println("Enter an integer");
			 num = scan.nextInt();
		 }while(num%2!=0);
		 System.out.println("You Won...");
		 scan.close();
		   
	
	}	
}

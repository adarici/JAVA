package day11loops;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		/*
	 	Create the following image by getting the number of rows from user
	 				 .
	                 .
	              * * * *
	               * * *
	                * *
	                 * 
*/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the length of base...");
		int len = scan.nextInt();
		
		for(int i = len;i>0;i--) {
			
			for(int j=0;j<len-i;j++) {
				System.out.print(" ");
			}
			for(int k=len;k>len-i; k--) {
			System.out.print("* ");	
			}
			System.out.println();
		}
		scan.close();
	}

}

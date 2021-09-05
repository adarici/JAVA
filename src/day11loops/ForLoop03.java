package day11loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		for (int i=1; i<4;i++) {
			for(int j = 5;j<7;j++) {
				System.out.println(i+"-"+j);
			}
		}
		/*
		 Ask user to enter the number of rows and columns then 
		 draw rectangle by using *
		 Example:row =3, column =4
		 				* * * *
		 				* * * * 
		 				* * * * 
		 
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number of row...");
		int row = scan.nextInt();
		System.out.println("enter the number of column...");
		int col = scan.nextInt();
		
		for(int i=1; i<row+1;i++) {
			
			for(int j=1; j<col+1;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
			
			scan.close();
		}
	}

}

package selfstudyreplit;

import java.util.Scanner;

import javax.swing.RowSorter;

public class ReverseNumber01 {

	public static void main(String[] args) {
		/*
		 * Write a java program to reverse the number 
		 * which user entered.

Input  :1238  
Output :Reverse Of The Number: 8321
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to revese it");
		int num = input.nextInt();
		int rev =0;
		
	while( num!=0) {
		rev=rev*10+num%10;
		num=num/10;
		
		
	}System.out.print(rev);
		
	}

}

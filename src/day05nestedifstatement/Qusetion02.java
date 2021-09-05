package day05nestedifstatement;

import java.util.Scanner;

public class Qusetion02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a 4 digits integer, 
		 then print the sum of the first 
		and the last digit of the number on console.
		For example; if user enters 1234 you will add 1 and 4, 
			then print on the console 5
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a 4 digit integer");
		int num = scan.nextInt();
		
		num=Math.abs(num);
		
		if (num>999&&num<10000) {
			int first = num/1000;
			int last = num%10;
			System.out.println("The sum is "+ (first+last));
		}else {
			System.err.println("pls 4 digit");
		}
		scan.close();
	}

}

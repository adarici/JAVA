package day11loops;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 Type a program to find the sum of the integers from 1 to 100
		 */
		
		int sum =0;
		for(int i =1; i<101; i++) {
			sum = sum+i;
		}
		// if you want to see only final sum put the System.out.println("sum: "+sum); 
		// out side the loop body 
		System.out.println("sum: "+sum);
		
		/*
		 Ask user to enter starting and ending value, then 
		 find the sum of all integers from the starting to the ending value.
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter starting value...");
		int x = scan.nextInt();
		System.out.println("enter ending value...");
		int y =scan.nextInt();
		int s =0;
	if(x>y) {
		System.err.println("Starting value should be greater");
	}else {
		for(int i =x;i<y+1;i++) {
			s=s+i;
		}
		System.out.println("Sum from user: "+s);
	}
	scan.close();
	}
	
}

package day11loops;

import java.util.Scanner;

public class ReviewWhileLoopQuestions01 {

	public static void main(String[] args) {
		/*1st Question06
		 Write a Java code by using while-loop
		 Write a program to print numbers from 1 to 5.
		 */
		
		int num =0;
		while (num<5) {
			num++;
			System.out.print(num+"/");
		}
		/*2nd Question06
		 Write a Java code by using while-loop
		 Write a program that types first 30 consecutive odd integers.
		 */
		System.out.println();
		int num1=0;
		while(num1<60) {
			num1++;
			if(num1%2!=0) {
				System.out.print(num1+",");
			}
		}
		/* 3rd Question06
		 Write a Java code by using while-loop
		 Write a program that prompts the user 
		 to input a positive integer.
		 It should be then print the multiplication table of that number.
		 */
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a positive integer");
		
		int num3=scan.nextInt();
		int i = 1;
	       while( i <=num3) {
	    	   i++;
	         for(int j=1;j<=num3;j++) {
	        	 
	        	 System.out.print(i*j+" ");
	        	 
		}System.out.println();
scan.close();
	}

	}}

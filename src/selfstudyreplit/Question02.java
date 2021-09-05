package selfstudyreplit;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to compute and 
		 * print sum of two given numbers (more than or equal to zero). 
If given integers or the sum have more than 10 digits, print "overflow".
EXAMPLE:
INPUT      :  
Input two integers:
25
46
OUTPUT : 
Sum of the numbers: 71 
		 */
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two integers");
		
		long num1 = scan.nextLong();
		long num2 = scan.nextLong();
		long sum=num1+num2;
		
		if(sum>99999999) {
			System.out.println("overflow");
		}else {
		System.out.println("Sum of the integers: "+(sum));
		}
		
		scan.close();
	}

}

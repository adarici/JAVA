package practiceclassday03;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * Write a program in Java to input 5 numbers 
		 * from keyboard and find their sum and average.
EXAMPLE:
       INPUT     : 
Input the 5 numbers :                                                           
1                                                                               
2                                                                               
3                                                                               
4                                                                               
5             
    OUTPUT :
The sum of 5 no is : 15                                                         
The Average is : 3.0
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an num");
		double a = scan.nextInt();
		
		System.out.println("Enter 2nd num");
		double b = scan.nextInt();
		
		System.out.println("Enter 3rd num");
		double c = scan.nextInt();
		
		System.out.println("Enter 4th num");
		double d = scan.nextInt();
		
		System.out.println("Enter 5th num");
		double e = scan.nextInt();
		
		double sum = a+b+c+d+e;
		
		double ave = sum/5;
		
		System.out.println("the sum is: " + sum);

		System.out.println("the average is: " + ave);
		
		
		
	}

}

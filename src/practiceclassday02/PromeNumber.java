package practiceclassday02;

import java.util.Scanner;

public class PromeNumber {

	public static void main(String[] args) {
		/*Explanation about primeNumber,
		 * Prime numbers are numbers that have only 2 factors:
         * 1 and themselves. For example, 
         * the first 5 prime numbers are 2, 3, 5, 7, and 11. 
         * By contrast, numbers with more than 2 factors are call composite number.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter an Integer");
		int num =scan.nextInt();
		
		if(num%1==0 && num%num==0) {
			System.out.println(num+" is primenumber");
		}else {
			System.out.println(num+" not a primenumber");
		}
		

	}

}

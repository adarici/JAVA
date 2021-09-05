package selfstudyreplit;

import java.util.Iterator;

public class ForWhileLoop04 {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts an integer 
		 * as input and calculates factorial and prints like output.

Input : 6
Output: 6!=6*5*4*3*2*1=720
		 */
		System.out.println("6!=6*5*4*3*2*1= "+factorial(6));
		
	}
	
	public static int factorial(int num) {
		
		int prod=1;
		for (int i = num; i >0; i--) {
			prod=prod*i;
			
		}
			return prod;
		}
	}



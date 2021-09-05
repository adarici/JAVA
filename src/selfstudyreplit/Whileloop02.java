package selfstudyreplit;

import java.util.Scanner;

public class Whileloop02 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter 2 integer then find 
		 * GCD (Greatest Common Divisor) and 
		 * LCM (Least Common Multiple) 
	
Input : 
30 and 40
Expected OutPut:	
GCD for 30 and 40 = 10
LCM for 30 and 40 = 120
		 */
		
		Scanner scan = new Scanner ( System.in);
		System.out.println(" Etnter two int ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int container,GCD,LCM,a=num1,b=num2;
		
		while(num2 != 0)
	    {
			container = num2;
			num2 = num1 % num2;
			num1 = container;
	}
		GCD = num1;
		System.out.println("GCD of " + a + " and " + b + " = " + GCD);
		
		LCM = (a * b) / GCD;
		System.out.println("LCM of " + a + " and " + b + " = " + LCM);	
		scan.close();
	}
	} 




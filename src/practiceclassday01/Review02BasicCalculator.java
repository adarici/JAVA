package practiceclassday01;

import java.util.Scanner;

public class Review02BasicCalculator {

	public static void main(String[] args) {
		/*
		 *  Ask user to enter two numbers 
		 *  Show them a menu of operation signs and ask them to choose one.
		 *   "Addition: 1 , Subtraction : 2  Multiplication : 3,
		 *   Division : 4 Print the result on the console
		 * EXAMPLE: INPUT: Num1 : 23 Num2 : 55 OUTPUT : Result : 78
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, enter two numbers to calculate.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Which operator do you prefer?"
				+ "\n1 for Addition\n2 for Substraction\n3 Multiplication\n4 for Division");
		
		int operation = scan.nextInt();
		switch (operation) {
		case 1:
			System.out.println("Result is "+ (num1+num2));
			break;
		case 2:
			System.out.println("Result is "+(num1-num2));
			break;
		case 3:
			System.out.println("Result is "+ (num1*num2));
			break;
		case 4:
			if(num1<num2) {
				System.out.println("Java used Explicit Narrowing");
			}
			System.out.println("Result is "+ (num1/num2));
			break;

		default:
			break;
		}scan.close();

	}

}

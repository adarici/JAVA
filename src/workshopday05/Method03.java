package workshopday05;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/*
		 * write a method and get a number from user 
		 * then check number is even or odd
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();

		oddOrEven(num);
		System.out.println(evenOrOdd(num));
	}
	public static void oddOrEven(int a) {
		if(a%2==0) {
			System.out.println(a+" is even number");
		}else {
			System.out.println(a+" is odd number");}
		
		}
		public static String evenOrOdd(int a) {
			if(a%2==0) {
				return "even number";
			}else {
				return"odd number";
			
		}
	}

}

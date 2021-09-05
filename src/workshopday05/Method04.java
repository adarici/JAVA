package workshopday05;

import java.util.Scanner;

public class Method04 {

	public static void main(String[] args) {
		/*
		 * Write a method, getting a number from user 
		 * than get next 3 numbers.
		 * Example=> input number =15
		 *           output       =16,17,18
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		add(num);
		System.out.println(add1(num));
	}
	public static void add(int a) {
		System.out.println((a+1)+", "+(a+2)+", "+(a+3));
	}
	
	public static String add1(int a) {
		return (a+1)+", "+(a+2)+", "+(a+3);
		
	}
}

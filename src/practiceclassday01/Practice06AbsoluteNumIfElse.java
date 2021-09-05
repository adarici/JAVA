package practiceclassday01;

import java.util.Scanner;

public class Practice06AbsoluteNumIfElse {

	public static void main(String[] args) {
		/*
       * Type java code by using if-else statement,
       * Write a program to print absolute value of a number entered by user.
       */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, enter a number");
		int num=scan.nextInt();
		
		if(num>0) {
			System.out.println(num+ " is absolute");
		}else {
			System.out.println("absolute of number is " +-1*num);
		}scan.close();
	}

}

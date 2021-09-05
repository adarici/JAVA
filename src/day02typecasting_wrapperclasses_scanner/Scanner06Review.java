package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner06Review {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the volume of a rectangular prism 
		whose length, with, and height are entered by user. 
			Hint 1: Volume of a rectangular prism is width x length x height
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey user, enter the width x length x height of rectengular prism ");
		
		double width = scan.nextDouble();
		double length = scan.nextDouble();
		double height = scan.nextDouble();
		System.out.println("Volume:" + width * length *height);
		

	}

}

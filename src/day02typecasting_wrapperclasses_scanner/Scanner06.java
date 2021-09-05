package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {


		/*
		 Type a program which calculates the volume of a rectangular prism 
		whose length, with, and height are entered by user. 
			Hint 1: Volume of a rectangular prism is width x length x height
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the prism width, length, and heigth...");
		
		double length = scanner.nextDouble();
		
		double width = scanner.nextDouble();
		
		double heigth = scanner.nextDouble();
		
		System.out.println("Volum:" + width*length*heigth);
		
	}

}

package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner05Review {

	public static void main(String[] args) {
		/*
	 	Type a program which calculates the area and the perimeter 
	 	of a rectangle whose length and width are entered by user. 
		Hint 1: Area of a rectangle is width x length
		Hint 2: Perimeter of a rectangle is 2*(width + length)
	*/
		Scanner scan = new Scanner (System.in);
		System.out.println("Hey user, enter the width and length of the rectangle..");
		double width = scan.nextDouble();
		double length = scan.nextDouble();
		System.out.println("Area:"+width*length);
		System.out.println("Parameter:" + 2*(width+length));
		
		
	}

}

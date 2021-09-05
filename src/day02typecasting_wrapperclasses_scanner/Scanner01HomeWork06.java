package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner01HomeWork06 {

	public static void main(String[] args) {
		/*
		  Type a program which calculates the perimeter of a triangle whose 
			Side lengths are entered by user. (Use byte) 
			Hint 1: Perimeter of a triangle is a + b + c 
			Hint 4: To get byte, use nextByte()
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls enter the side lengths of the triengle");
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		System.out.println("Perimeter:" +(a+b+c));
		
	}

}

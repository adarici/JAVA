package day05nestedifstatement;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		/*
		
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer...");
		int n = scanner.nextInt();
		
		if (n<0) {
		 if(n<-9) {
			 System.out.println("Too small");
			
		}else {
			System.out.println("Small");
		}}else if(n>0) {
			if(n>9) {
				System.out.println("Too bib");
			}
			else {
				System.out.println("Big");
			}
			}else {
				System.out.println("Pls enter negative or positivr integers");
		} scanner.close();

		}
	}



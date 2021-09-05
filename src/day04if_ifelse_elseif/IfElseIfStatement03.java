package day04if_ifelse_elseif;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		/*
		 A school has following rules for grading system:
			1. Below 50 - D   2. 50 to 59 - C     3. 60 to 80 - B.   4. From 80 to 100 - A 
			Ask user to enter marks and print the corresponding grade
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the notes");
		
	int n = scanner.nextInt();
	if(n<0) {
		System.err.println("Please do not enter negatives");
	}
	else if(n<50) {
			System.out.println("D");
	}else if(n<60) {
			System.out.println("C");	
		}
		else if(n<80) {
			System.out.println("B");
		}
		else if (n<101){
			System.out.println("A");
		}else{
			System.err.println( "Please enter 100 at most..");
		}
	scanner.close();

	}
	}

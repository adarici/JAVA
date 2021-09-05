package day04if_ifelse_elseif;

import java.util.Scanner;

public class IfElseStatement00HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls enter your gender and gender...");
		
		int age = scan.nextInt();
		boolean male = scan.nextBoolean();		
		
		if (male) {
			if (age<20) {
				System.out.println("Boy");
			}else {
				System.out.println("Man");}
			
					
				}
		scan.close();
			}
			
		

	}



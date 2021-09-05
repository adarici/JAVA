package day05nestedifstatement;

import java.util.Scanner;

public class NestedIfStatement03HomeWork {

	public static void main(String[] args) {
		/*
		 Type java code by using nested if() statement.
			Ask user to enter a password 
			If the initial of the password is uppercase then check if it is ‘A’ or not. 
			If it is ‘A’ the output will be “Valid Password” 
			otherwise the output will be “Invalid Password”
			For example; Ali ==> Valid password - ali ==> Invalid - Mark ==> Invalid
			If the initial of the password is lowercase then check if it is ‘z’ or not. 
			If it is ‘z’ the output will be “Valid Password” 
			otherwise the output will be “Invalid Password”
			For example; zoe ==> Valid password - Zoe ==> Invalid - john ==> Invalid
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, enter your password.");
		char ch0 = scan.next().charAt(0);
		String ch1 = scan.nextLine();
		char ch2 = scan.next().charAt(0);
		String ch3 = scan.nextLine();
	if(ch0=='A'||ch1=="oe")	{
		if(ch2=='z'||ch3=="oe")
		System.out.println("Valid Password..");
	}else {
		System.err.println("Invalid Password");
	}scan.close();
	}}
			
			
		
		
		
			



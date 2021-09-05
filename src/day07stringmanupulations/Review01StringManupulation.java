package day07stringmanupulations;

import java.util.Scanner;

public class Review01StringManupulation {

	public static void main(String[] args) {
		/*
	 	Ask user to enter a String.
	 	Type code to return every time the last character of the String
	*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, enter a scting to find last character.");
		String name= scan.nextLine().toLowerCase();
		System.out.println(name.charAt(4));
		System.out.println(name.length());
		System.out.println(name.charAt(name.length()-1));
		
		String text ="Hallo every body";
		
		System.out.println(text.indexOf("e"));//6
		System.out.println(text.indexOf('0'));//-1 
		
		System.out.println(text.indexOf("x"));//-1 
		System.out.println(text.indexOf('r'));//9
		
		String  ad="Ali Darici";
		System.out.println(ad.contains(" "));
		
	       scan.close();                      
	}

}

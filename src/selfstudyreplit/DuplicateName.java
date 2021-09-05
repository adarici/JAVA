package selfstudyreplit;

import java.util.Scanner;

public class DuplicateName {

	public static void main(String[] args) {
		/*
		 Ask user to type a name, 
the length of name should be 3.
Then check if the name has same characters.
If the String has same characters 
Print “String has duplicate characters”
Else
Print “String has unique characters” 
Please use ternary.
Input : 
ala
OutPut:
String has duplicate characters
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a 3 characters name");
		String x = scan.nextLine();
		String y = "ala";
		
		//String str2 = scan.nextLine();
		
		if( x.contains(y)) {
			
			System.out.println("String has duplicate characters");	
		}
		else {
			System.err.println("String has  unique characters");
		}
		scan.close();
	}

}

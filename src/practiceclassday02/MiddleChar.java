package practiceclassday02;

import java.util.Scanner;

public class MiddleChar {

	public static void main(String[] args) {
		/*1.Ask user to enter a word. 
			If the word has odd number of characters
			length() of character and has 3 or more characters, 
			print the character in the middle of the word.
			ergun==>g
		*/
		
		Scanner scan=new Scanner(System.in);
	       System.out.println("Please enter a word ");
	       
	       String word = scan.nextLine();
	      if(word.length()>3 && word.length()%2==1) {
	    	 String str = word.substring(word.length()/2, word.length()/2+1);
	    	 System.out.println(str);  
	      }else {
	    	  System.out.println("it is an even number of chars");
	      }
	       scan.close();

	}

}

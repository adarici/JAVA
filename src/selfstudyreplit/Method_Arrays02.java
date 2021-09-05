package selfstudyreplit;

import java.util.ArrayList;
import java.util.Collections;

public class Method_Arrays02 {

	public static void main(String[] args) {
		/*
		 Write a Java program that reverse a sentence by using Array
		  (with all spaces and special characters).
Input  : Coding is great.
Output : .taerg si gnidoC
		 */
		String str ="Coding is great";
		System.out.println("The original string is: " + str);
		
		String strSentence[] = str.split("\\a");
		
		String rev = "";
		
		for(String w : strSentence) {
		
			StringBuilder sb = new StringBuilder(w);
		
			sb.reverse();
		rev += sb.toString() + " ";
		}
		System.out.println("The modified string is: " + rev);
	    
}
}

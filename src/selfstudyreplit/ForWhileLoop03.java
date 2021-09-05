package selfstudyreplit;

import java.util.Arrays;

public class ForWhileLoop03 {

	public static void main(String[] args) {
		/*
		 * Write a code that returns the duplicate chars 
		 * in a String array. (interview Question06)
		 * 
Input :  
String str=“Javaisalsoeasy” 
Output: [a, s]
		 */
		String str="Javaisalsoeasy";
		
		String ch[] = str.split("");
//		System.out.println(Arrays.toString(ch));
		int count=0;
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (ch[i] == ch[j]) {
		   
	    System.out.print(Arrays.toString(ch));	
		     count++;
		     break;
	
		

	}
		   }}
		  }
}

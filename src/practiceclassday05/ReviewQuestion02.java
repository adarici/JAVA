package practiceclassday05;

import java.util.Arrays;

public class ReviewQuestion02 {
	/*
	 Write a method that checks to see if two words are Anagram or not. 
	 EX: read and dear  --> true
	 */
	static boolean isAnagram(String str1, String str2) {
		//split()
	String[]arr1=str1.split("");
	String []arr2 = str2.split("");
	
	//toCharArray
//	char []arr1=str1.toCharArray();
//	char []arr2=str2.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	return Arrays.equals(arr1, arr2);
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("read","dear"));

	}

}

package selfstudyreplit;

import java.util.Arrays;


public class Method_Arrays04 {

	public static void main(String[] args) {
		/*
		 Create a custom return type method accepts a name as parameter 
		 and prints the name as a char array. 
	(do not use toCharArray() method)
	Input : John
	Output :[J, o, h, n]
		 */

		String name = "John";
		String[] arr = name.split("");
		System.out.println(Arrays.toString(arr));
           
         }

	}



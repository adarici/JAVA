package day18arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReviewQuestion01 {

	public static void main(String[] args) {
		/*
		 * 1) Create an integer array together with user
		 * 2) Type code to print minimum and maximum elements
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the length of array to get min and max values");
		
		int  len= scan.nextInt();
		int arr[] = new int[len];
		
		int numOfEl = 1;
		 
		do {
			System.out.println("Enter "+numOfEl+" element");
			arr [numOfEl-1]=scan.nextInt();
			numOfEl++;
			
		}while(numOfEl<=arr.length);
		System.out.println("Arrays before sort(): "+Arrays.toString(arr));
	
		Arrays.sort(arr);
		System.out.println("Arrays after sort(): "+Arrays.toString(arr));
		
		System.out.println("Min value of array; "+arr[0]);
		System.out.println("Max value of the array: "+arr[arr.length-1]);
	scan.close();
	}

}

package day25encapsulationsndinterviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion01 {

	public static void main(String[] args) {
		/*
		 take an array from the user and get the sum of the all elements
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int len = scan.nextInt();
		int arr [] = new int [len];
		System.out.println("Please enter "+len+" elements");
		
		for (int i = 0; i < len; i++) {
			arr[i]=scan.nextInt();			
		}System.out.println("Before sum: "+Arrays.toString(arr));
		int sum=0;
		for (int i : arr) {
			sum+=i;
		}
		System.out.println("Sum: " + sum);
		
		//the difference between the biggest and smallest number
		Arrays.sort(arr);
		int diffBiggestAndSmallest=arr[len-1]-arr[0];
		System.out.println(diffBiggestAndSmallest);
		scan.close();
		
		
	}

	}


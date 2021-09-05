package selfstudy01;

import java.util.Arrays;
import java.util.Scanner;

public class SelfStudyArray01 {

	public static void main(String[] args) {
		/*
		 * 1) Create an integer array together with user
		 * 2) Type code to print minimum and maximum elements
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the length of array");
		
		int a =scan.nextInt();
		int arr[]=new int [a];
		int i = 0;
		do {
			System.out.println("Enter "+(i+1)+" elements");
			arr[i]=scan.nextInt();
			i++;
			
		}while(i<a);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(" Min value: "+arr[0]);
		System.out.println("Max value: "+arr[a-1]);

		scan.close();
	}

}

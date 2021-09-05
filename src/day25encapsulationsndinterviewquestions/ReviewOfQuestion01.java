package day25encapsulationsndinterviewquestions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ReviewOfQuestion01 {

	public static void main(String[] args) {
		
		// Take an array from the user and get the sum of the all elements
Scanner scan = new Scanner (System.in);
System.out.println("Pls, enter the length of your array");
int len = scan.nextInt();
int arr[]= new int[len];
System.out.println("Enter your "+len+" elemets");

for (int i = 0; i < arr.length; i++) {
	arr[i]=scan.nextInt();
	
}
System.out.println(" List of your elements: "+Arrays.toString(arr));
int sum=0;
for (int i : arr) {
	sum+=i;
}
System.out.println(" The sum of your arrays: "+sum);
		}
		
	}



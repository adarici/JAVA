package day17arrays;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		
		String ali[]=new String [5];
		ali[0]="Fatih";
		ali[1]="Busra";
		ali[2]="Nur";
		ali[3]="Zerrin";
		ali[4]="Afra";
		
		System.out.println(Arrays.toString(ali));
		// Print all elements 1 by 1
		//1.Way
		System.out.println(ali[0]);
		System.out.println(ali[1]);
		System.out.println(ali[2]);
		System.out.println(ali[3]);
		System.out.println(ali[4]);
		
		//". Way by using for loop
		System.out.println();
		for(int i = 0; i<5;i++) {
			System.out.println(ali[i]);
			
		}
		// for loop by using length()
		System.out.println();
		for(int i = 0; i<ali.length;i++) {
			System.out.println(ali[i]);
			
		}
		
		/*
		 *  1)Create a double array whose length is 6
            2)Type a program to add all elements inside the array
            3)Print the sum on the console.
		 */
		// we can also add elements directly in to the array
		
		double a []= {12.1,11.0,13.5,11.2,2.4,4.1};
		double sum =0;
		for(int i =0; i<a.length;i++) {
			sum=sum+a[i];
			
			
		}
		System.out.println("The sum of arrays: "+sum);

	}

}

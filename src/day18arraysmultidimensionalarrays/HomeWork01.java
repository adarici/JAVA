package day18arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		/*
		 *1) Create a String array together with the user
		 *2) Find the multiplication of the length of the elements.
		 */
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the  number of elements in the array :: ");
	      
	      int num = scan.nextInt();
	      int arr[] = new int [num];
	      int product = 1;
	     
	      System.out.println("Enter the elements of the array one by one ");
	     
	      for(int i=0; i<num; i++) {
	         arr[i] = scan.nextInt();
	         product = product * arr[i];
	      }
	      
	      System.out.println("Elements of the array are: "+Arrays.toString(arr));
	      System.out.println("Multiplication of the elements of the array:"+product);
				
		scan.close();
		}
		}
	
			


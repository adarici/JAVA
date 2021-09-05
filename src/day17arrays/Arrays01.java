package day17arrays;

import java.util.Arrays;

public class Arrays01 {
/*
 *we use arrays to store multiple elements in to the same container
 *we can store just same data types in to the same array
 *we can use just primitive data types and references theoretically
 *but array itself is non primitive
 *arrays store inside heap memory
 *we reach the elements by using index
 *==> datatype + nameOfArray + [] = new datatype[sizeOfArray]
 */
	public static void main(String[] args) {
		// How to create an array
		int arr[]=new int[5];
		// adding elements into the array
		arr[0]=3;
		arr[1]=2;
		arr[2]=4;
		arr[3]=9;
		arr[4]=7;
		
		// How to print an array
		
		System.out.println(Arrays.toString(arr));
		
		// How to print a specific index
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		// we get index out of bound exception 
		// if we put a number greater than the arrays'size
		
		//System.out.println(arr[5]);
		// How to get number of elements inside an array
		// don't mixed it with the method of length() that we used for STRING
		System.out.println("number of the elements inside the array is :"
				+ " "+arr.length);
		
		
	}

}

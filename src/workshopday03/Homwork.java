package workshopday03;

import java.util.Arrays;
import java.util.Scanner;

public class Homwork {

	public static void main(String[] args) {
		/*
		 *1) Create a String array together with the user
		 *2) Find the multiplication of the length of the elements.
		 */
		
Scanner scan = new Scanner(System.in);
System.out.println("Enter the len of array");

int num = scan.nextInt();
int arr[] = new int [num];
int prod = 1;
System.out.println("Enter the elements");
for(int i = 0; i<num;i++) {
	arr[i]=scan.nextInt();
	prod=prod*arr[i];
	
}System.out.println(Arrays.toString(arr));
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
System.out.println(prod);
		scan.close();
	}

}

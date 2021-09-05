package practiceclassday03;

import java.util.Scanner;


public class qouestion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three digit num");
		
		int num = scan.nextInt();
		int sum =0;
		 
		while (num!=0) {
			sum = sum + num%10;
			num=num/10;
		}
		System.out.println("the sum of all digits: " + sum);
	
	
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a side of the square");
		int side  = scan.nextInt();
		
		System.out.println("The area of square is " + side*side);
		System.out.println("The perimeter of square is " + 4*side);
		
		
		
		
}
}
package practiceclassday02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*Write a program to print a number entered by user,
		 * which are not divisible by 5 and divisible by 5
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls, enter a Integer ");
		int num = scan.nextInt();
		//1.way
				if(num%5==0) {
			System.out.println(num+" Divisible");
		}else {
		System.out.println(num+" not divisible");
		}
		
		//2.way
		String str=num%5==0?num+" divisible by 5":num+" is not divisible by 5";
		System.out.println(str);
		
		//3.way
		System.out.println(num%5==0?num+ " divisible by 5":num+" is not divisible by 5");
		
		scan.close();	
	}

}

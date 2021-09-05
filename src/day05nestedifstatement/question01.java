package day05nestedifstatement;

import java.util.Scanner;

public class question01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter year
		Type java code by using if-else if() statement.
		Write a program to check if a year is leap year or not.
		if the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a year to check Leap ot not");
		int year = scan.nextInt();
		/*
		 & and && have similar functionality.
		 &==> slower because of more work as checking all conditions
		 &&==> faster check only one side and faster preferable
		 */
		if (year%100==0 && year%400==0) {
			System.out.println(year+" is leap year");
		}else if (year%100!=0 && year%4==0) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+" is not leap year");
		}
		scan.close();
		
	}

}

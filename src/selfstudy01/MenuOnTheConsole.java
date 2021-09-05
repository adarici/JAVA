package selfstudy01;

import java.util.Scanner;

public class MenuOnTheConsole {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please choose\n1 for Human resuorces\n2 for Automatic replies");
		
		int num1 = scan.nextInt();
		System.out.println(num1+" Welcome to Human resuorce center");
		
		System.out.println("Press\n1 for Human resource officer\n2 for Human resource Manager");
		
		int num3=scan.nextInt();
		System.out.println(num3+" Welcome to Human resuorce office");
		System.out.println("Press\n1 for Human resourse Manager\n2 for Human resourse Office");
		
		int num4 = scan.nextInt();
		System.out.println(num4+"Welcome to Human resuorce Manager/pls wait Manager will repond soon");
		int num5=scan.nextInt();
		System.out.println(num5+"Welcome to Human resuorce Officer/pls wait worker will repond soon");
		int num2 = scan.nextInt();
		System.out.println(num2+" Welcome to Auto-replies");
		scan.close();
	}

}

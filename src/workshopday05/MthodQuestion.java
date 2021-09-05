package workshopday05;

import java.util.Scanner;

public class MthodQuestion {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		cub(a);
		System.out.println(a);
	}
	public static void cub(int a ) {
		System.out.println(a*a*a);
	}
	public static int add(int a) {
		return a*a*a;
	}
	
}

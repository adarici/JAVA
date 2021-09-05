package workshopday01;

import java.util.Scanner;

public class SumOfThreeDigits {

	public static void main(String[] args) {
		//Write a java code and ask user a three digit number 
		// to show on the console sum of the number
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three degit number");
		int x = scan.nextInt();//123
		
		int ld = x%10;//3
			x = x/10;//12
			
		int md =x%10;//2
			 x=x/10;//10
			
		int fd=x%10;//1
		
		int sum = ld+md+fd;
		
		System.out.println(sum);
		scan.close();

	}

}

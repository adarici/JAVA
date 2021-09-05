package workshopday02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Ask the user how much tea he drinks and 
		 * how much sugar he uses per day. Calculate and print 
		 * how many kg of sugar he use in a year.
1 sugar = 1.7 g
Sample Output:
He uses 12.41 kg sugars per year
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("how many class of tea you drinks");
		int tea = scan.nextInt();
		
		System.out.println("how much sugar you put in a class");
		double sugar = scan.nextDouble();
		
		double total = tea*sugar*365*1.7/1000;
		
		System.out.println("Anualy "+total+" kg");
	scan.close();	
	}

}

package practiceclassday01;

import java.util.Scanner;

public class Review05NumberOfMinutes {

	public static void main(String[] args) {
		/* Ask user to enter minutes,
	       * Write a Java program to convert minutes into a number of years and days.
	       * Input: number of minutes 3456789
	       * Output: 3456789 minutes is approximately 6 years and 210 days
	       */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a minutes to convert it to years days..");
		
		long minutes=scan.nextLong();
		long year = minutes/(60*24*365);
		long days = (minutes/60/24)%365;
		
		System.out.println(minutes+" minutes are approximately "+year+" years "+"and " +days+" days");
		

		scan.close();
	}

}

package selfstudyreplit;

import java.util.Scanner;

public class DayConvert {

	public static void main(String[] args) {

			    Scanner input = new Scanner(System.in);
			    int noOfDays, year, month, week, days;

			    System.out.print("Enter Number of Days: ");
			    noOfDays = input.nextInt();

			    year = noOfDays/365;
			    month = year%12;
			    week = month%30;
			    days = week%7;

			    System.out.println("Year: " + year);
			    System.out.println("Month: " + month);
			    System.out.println("Week: " + week);
			    System.out.println("Day: " + days);
			

	}

}

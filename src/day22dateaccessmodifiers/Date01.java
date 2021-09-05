package day22dateaccessmodifiers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		/* You are gonne use date to learn how long does it take
		 *  to run a block of code or to name your screenshots
		 *   to put inside your report
		
		*/
		// How to create an object.
		
		LocalDate currentDate = LocalDate.now();
		
		System.out.println(currentDate);
		System.out.println(currentDate.plusDays(5));
		System.out.println(currentDate.plusMonths(2));
		System.out.println(currentDate.plusYears(5));
		
		System.out.println(currentDate.plusDays(-5));
		System.out.println(currentDate.minusDays(5));// preferable
		
		System.out.println("Yesterday date was; "+currentDate.minusDays(1));
		System.out.println("Tomorrow date is: "+currentDate.plusDays(1));

		LocalDate tomorrow = currentDate.plusDays(1);
		System.out.println("tomorrow:"+tomorrow);
		
		LocalDate yesterday = currentDate.minusDays(1);
		System.out.println("yesterday:"+yesterday);
		
		// Print on the console 2 years 3 months and 15 days
		System.out.println(currentDate.plusYears(2).plusMonths(3).plusDays(15));
		
		// 5month+27day before
		System.out.println(currentDate.minusMonths(5).minusDays(27));
	
		// How to get just value of the year
		System.out.println(currentDate.getYear());
		
		// How to get just value of the month
				System.out.println(currentDate.getMonthValue());
				System.out.println(currentDate.getMonth());
				
				// get the day 
	System.out.println(currentDate.getDayOfMonth());
	System.out.println(currentDate.getDayOfYear());
	System.out.println(currentDate.getDayOfWeek());
	
	// to create specific date
	
	LocalDate date1=LocalDate.of(1977, 4, 2);
	System.out.println(date1);
	System.out.print(date1.getDayOfWeek()+" My birth day");
	System.out.println();
	
	// compare 2 dates
	
	System.out.println(currentDate.isAfter(date1));
	System.out.println(currentDate.isBefore(date1));
	
	// format is yyyy-MM-dd this called default format
	// lets change the default format
	// Please use upper case M for Month. Do not use lower case Its for minutes
	
	LocalDate currentDate1=LocalDate.now();
	System.out.println(currentDate);
	
	// to format out date we use DateTime Formatter
	
	DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("dd/MMM/yyyy");
	System.out.println("After formatting: "+dateTimeFormatter.format(currentDate1));
	
	DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println("After formatting: "+dateTimeFormatter1.format(currentDate1));
	
	DateTimeFormatter dateTimeFormatter2  = DateTimeFormatter.ofPattern("dd/M/yyyy");
	System.out.println("After formatting: "+dateTimeFormatter2.format(currentDate1));
	
	DateTimeFormatter dateTimeFormatter3  = DateTimeFormatter.ofPattern("dd/MMM/yy");
	System.out.println("After formatting: "+dateTimeFormatter3.format(currentDate1));
	
	DateTimeFormatter dateTimeFormatter4  = DateTimeFormatter.ofPattern("dd/MMMM/yy");
	System.out.println("After formatting: "+dateTimeFormatter4.format(currentDate1));
	
	System.out.println(dateTimeFormatter3.format(currentDate1.plusMonths(3)));
	System.out.println(dateTimeFormatter3.format(currentDate1.plusMonths(3).plusDays(11)));
	
	LocalTime currentTime = LocalTime.now();
	System.out.println(currentTime);
	
	// if you use lower case 'h' it will be in 12 hours format
	DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm");
	System.out.println(timeFormatter.format(currentTime));
	// if you want to use 24 hours format that use 'H'
	DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofPattern("HH:mm");
	System.out.println(timeFormatter1.format(currentTime));
	
	DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofPattern("hh:mm a");
	System.out.println(timeFormatter2.format(currentTime));
	
	// how to get the difference between 2 dates
	
	LocalDate d1 = LocalDate.now();
	LocalDate d2 = LocalDate.of(1977, 4, 2);
	Period alisAge = Period.between(d2, d1);
	System.out.println(alisAge);
	
	int age=Period.between(d2, d1).getYears();
	System.out.println(age);
	
	
	
	
	
	
	
	
	
	
	}

}

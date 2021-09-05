package day16Statickeyword;

import java.util.Scanner;

public class ReviewStudentRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		do {
		
		System.out.println("Enter your first name");
		String firstName = scan.next();
		System.out.println("Enter your last name");
		String lastName = scan.next();
		String name=firstName+" "+lastName;
		
		System.out.println("Enter year");
		int year = scan.nextInt();
		System.out.println("Enter grade");
		int grade = scan.nextInt();
		
		ReviewStudents std1 = new ReviewStudents(name,year,grade);
		System.out.println(std1.name);
		System.out.println(std1.year);
		System.out.println(std1.grade);
		
		System.out.println("std1 id: "+ReviewStudents.id);
		System.out.println("sdt1 name: "+std1.name);
		System.out.println("std1 year: "+std1.year);
		System.out.println("std1 grade: "+std1.grade);
		
		System.out.println("to quit press Q, to go on press any key");
		String quit = scan.next().toUpperCase();
		if (quit.contentEquals("Q")) {
			break;
		}	
		}while (true);
		
		System.out.println("Thanks for choosing us!, See you later");
		scan.close();
	}

}

package day16Statickeyword;

import java.util.Scanner;

public class StudentRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		do {
			
		
		System.out.println(" Pls enter your first name");
		String firstName = scan.next();
		System.out.println(" Pls enter your last name");
		String lastName = scan.next();
		String name = firstName+" "+lastName;
		
		System.out.println(" Pls enter your grade");
		int grade = scan.nextInt();
		System.out.println(" Pls enter your year");
		int year = scan.nextInt();
		

 Students std1 = new Students(name,grade,year);
 // we comment put this method to call it from constructor. 
 //it will make our code more clear
 //
// std1.setId();
 System.out.println("std1.id :"+Students.id);
 System.out.println("std1.name :"+std1.name);
 System.out.println("std1.grade :"+std1.grade);
 System.out.println("std1.year :"+std1.year);
 
 //Students std2 = new Students("name",grade,year);
 //std1.setId();
 //System.out.println("std2.id"+std2.id+" "+name);
 
 System.out.println(" to quit press Q, to go on press any key");
 String quit = scan.next().toUpperCase();
 if (quit.contentEquals("Q")){
	 break;
 }scan.close();
	}while(true);
		System.out.println("Thanks for choosing us! See you later!");
		}
	}



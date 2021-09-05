package workshopday02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * Get the side lengths of the rectangle from the user 
		 * and write a program that prints the area and 
		 * perimeter of the rectangle to the console.
Sample Output:
Area: 32
Perimeter: 24
		 */
Scanner scan = new Scanner(System.in);
System.out.println("Enter the length of a regtangle");
double length=scan.nextDouble();
System.out.println("Enter the heigth of a regtangle");
double heigth =scan.nextDouble();

double area=length*heigth;
double perimeter= length+heigth*2;

System.out.println(area);
System.out.println(perimeter);
	scan.close();
	}

}

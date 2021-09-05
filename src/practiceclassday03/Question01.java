package practiceclassday03;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Without using any variable, by using only System.out.println, 
		 * apply the steps :
               1.Step : Print your firstname and surname
               2.Step : Print your height by skipping a line
               3.Step : Print your weight by skipping a line
               4.Step : Print your hobbies by skipping a line
               EXAMPLE:
               INPUT: Victor Hugo
                              172
                              61
                          Writing novels, listening music
               OUTPUT :Victor Hugo
                              172
                              61
                              Writing novels, listening music
		 */
	
		//1. Q
		System.out.println("Nanme: "+"Ali Darici");
		System.out.println("Heigth: "+"1,71");
		System.out.println("Kg: "+"85");
		System.out.println("Hobbies: "+"reading and listenning music");

		//2.Q
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a char");
		
//		char ch=scan.next().charAt(0);
//		int asc =ch;
//		System.out.println(asc);
//		
//		//3.Q
//		String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		System.out.println(name.charAt(0)+" "+name.charAt(11)+" "+name.charAt(8));
		
		//4.Q
		/*
		 * )Ask user to enter two integers
               1)Swap the integers
               2)EXAMPLE:
                INPUT: a= 3
                       b= 5
                OUTPUT: a= 5
                        b= 3
//		 */
//		System.out.println("Enter two integers");
//		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		System.out.println("before swap: "+"a="+a+" b="+b);
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After swap: "+"a="+a+" b="+b);
//	
	//5.Q
		/*
		 * ask user to enter 8 primitive data and print on the consle.
		 * /Byte,int,float,short,long,Boolean,double,char
            INPUT     : int num1=41                 
            OUTPUT : user enter  41
		 */
		
		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter a integer");
		int i = scan.nextInt();
		System.out.println("User enter "+i);
		
		System.out.println("Enter a double");
		double d = scan.nextDouble();
		System.out.println("User enter "+d);
		
		System.out.println("enter a float");
		float f = scan.nextFloat();
		System.out.println("User enter "+f);
		System.out.println("Enter a long");
		long l = scan.nextLong();
		System.out.println("User enter "+l);
		System.out.println("Enter a short");
		short s = scan.nextShort();
		System.out.println("User enter "+s);
		System.out.println("Enter a byte");
		byte b = scan.nextByte();
		System.out.println("User enter "+b);
		
		System.out.println("Enter a boolean");
		Boolean bo = scan.nextBoolean();
		System.out.println("User enter "+bo);
		
		System.out.println("Enter a char");
		char c = scan.next().charAt(0);
		System.out.println("User enter "+c);
	
		scaner.close();
		
		
		
	
	}

}

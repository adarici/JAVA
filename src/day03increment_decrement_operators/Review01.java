package day03increment_decrement_operators;

public class Review01 {

	public static void main(String[] args) {

		int num1 = 5/3;
		System.out.println(num1);
		
		float num2 = 5f/3f;
		System.out.println(num2);
		
		double num3 = 5d/3d;
		System.out.println(num3);
		
		int numA=2;
		numA = numA+3;
		System.out.println(numA);
		
		int numB = 10;
		numB*=7;
		System.out.println(numB);
		int numC = 5;
		numC++;
		System.out.println(numC);
		
		/*15) Write a program to assign a value of 100.235 to a double variable 
			and then convert it to int. Print it on the console.
		 
		 */
		double num4 = 100.235;
		int num5 = (int) 100.235;
		
		/*
		 16) Write a program to add an integer variable having value 5 
			and a double variable having value 6.2. Print the sum on the console.
		 */
		int num6 = 5;
		double num7 = 6.2;
		System.out.println(num6+num7);
		
		/*
		 17) Create an integer variable and increase it by 1, by using three different ways, 
		then type every result on the console.
		 */
		
		int num8 = 5;
		num8+=1;
		System.out.println(num8);
		int num9 = 7;
		num9++;
		System.out.println(num9);
		/*
		 18) Create an integer variable and decrease it by 1, by using three different ways, 
			then type every result on the console.
		 */
		int num10 = 2;
		num10 = num10-1;
		System.out.println(num10);
		
		int num11 = 8;
		num11--;
		System.out.println(num11);
		
	}

}

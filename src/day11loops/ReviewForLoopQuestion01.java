package day11loops;

public class ReviewForLoopQuestion01 {

	public static void main(String[] args) {
		/*
		 Write a program to print counting number 
		 from 10 to 57 on the console by using ForLoop.
		 */
		for(int i =10; i<58;i++) {
			System.out.print(i+" ");
		}
		// 2nd Question06
		/* Write a program to print even counting numbers 
		 from 100 to 43 on the console by using ForLoop.
		 */
		System.out.println();
		for (int i = 100; i>42;i-=2) {
			System.out.print(i+"_");
		}
		System.out.println();
		// 3rd Question06
				/* Write a program to print even counting numbers 
				 from 100 to 43 on the console by using ForLoop.
				 */
		for (int i = 200;i>32; i--) {
			if(i%2!=0) {
				System.out.print(i+".");
			}
			// 4th Question06
			/* Write a program to add counting numbers 
			 from 23 to 57  by using ForLoop 
			 Print the sum on the console.
			 */
			int sum=0;
			for(int j = 23;j<57;j++) {
				sum=sum+j;
			}
			System.out.println();
			System.out.println("The sum of the numbers: "+sum);
		}
		// 5th Question06
					/* Write a program to multiply counting numbers 
					 from 7 to 15  by using ForLoop 
					 Print the multiplication on the console.
					 */
		System.out.println();
		int sum =1;
		for (int j=7;j<16;j++) {
			sum=sum*j;
		}
		System.out.print(sum);
	
	// 6th Question06
	/* Write a program to print counting numbers 
	 from 200 and divisible by using ForLoop 
	 Print  on the console.
	 */
	{}
	System.out.println();
	for (int i = 200;i>0; i--) {
		if(i%5==0) {
			System.out.print(i+"-");
}
	}
	}
}

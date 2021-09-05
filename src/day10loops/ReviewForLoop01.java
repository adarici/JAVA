package day10loops;

public class ReviewForLoop01 {

	public static void main(String[] args) {
		//Print "Hello world!" on the console 10 times...
		
//		System.out.println("Hello Afra");
//		System.out.println("Hello Afra");
//		System.out.println("Hello Afra");
//		System.out.println("Hello Afra");
//		System.out.println("Hello Afra");
//		
		System.out.println();
		
		// using For Loop
		for(int i=1;i<=5;i++) {
			
			System.out.println("Hello Afra");
		}
		
		// between each character put a .
		for(int i=1;i<=10;i++) {
			System.out.print(i+".");
		}
		System.out.println();
		//backward counting
		for(int i=10;i>=1;i--) {
			System.out.print(i+".");
		
		}
		System.out.println();
		// counting by even numbers up to 100
		for(int i=0;i<101;i+=2) {
			System.out.print(i+".");
		}
		System.out.println();
		// counting by odd numbers up to 100
		for(int i=0;i<101;i+=3) {
			System.out.print(i+".");
	
	}
		System.out.println();
		for(int i=0;i<=100;i++) {
			if(i%3==0&&i%5==0) {
				System.out.print(i+".");
			}
			// Print every character of a String by putting 
			//space every consecutive character
			
			String name="AliBaba";
			
			for(int k =0;k<name.length();k++) {
				
				System.out.print(name.charAt(k)+" ");
			}
			
					}
	}
	

	}



package day03increment_decrement_operators;

public class SwapQuestion {

	public static void main(String[] args) {
		// 1.way use the third container
		
		int a = 12;
		int b = 5;
		int temp = 0;
		
		temp = b;
			b = a;
			a = temp;
		System.out.println(a);
		System.out.println(b);
		// 2. Way Do not use third container
		int c = 20;
		int d = 15;
		
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("After swap ");
		
		

	}

}

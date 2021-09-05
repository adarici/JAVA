package day12loops;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		/*
		 Difference of "while loop" and "do-while loop"
		 Answer: in do-while loop loop body is executed at least once
		 But in "while loop" loop body execution depends on the condition.
		 If condition is false whole loop body doesn't work.
		 */
		int i = 1;
		while(i>1) {
			System.out.println("While Loop!...");
			i++;
		}
		do {
			System.out.println("Do-While Loop");
			i--;
		}while(i>1);
		}
	

	}



package selfstudyreplit;

public class ForWhileLoop05 {

	public static void main(String[] args) {
		/*
		 * Print even numbers from 20 to 0 but do not use decrement (i--).
OUTPUT  : Even Numbers from 20 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
		 */
		
	String numbers = "";
		
		for (int i = 20; i >=0; i--) {
			if(i%2==0) {
			numbers=numbers+i+" ";	
			}
		}
		System.out.print("Even Numbers from 20 to 0 are: "+numbers);
	}

}

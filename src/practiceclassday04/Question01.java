package practiceclassday04;

public class Question01 {

	 /*
	  * Write a method that returns the sum of numbers 
	  * starting with 1 to the number passed into the method.
	  */
	
	public static void main(String[] args) {
		System.out.println(sum(5));
		
	}
	
	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i<=n; i++) {
			sum+=i;
		}
		
		return sum;

}
	
	
}

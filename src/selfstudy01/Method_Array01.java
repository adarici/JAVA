package selfstudy01;

public class Method_Array01 {

	public static void main(String[] args) {
		/*
		 * Write a return method to reverse number.
Input  : 12345 
Output : 54321
		 */
		

		
				System.out.println(reverse(123456789));

	}
	public static long reverse (long num) {
		
		long remainder=0;
		long result=0;
		
		while(num!=0)
		{
		remainder=num%10;
		
		result=(result*10)+remainder;
		
		num=num/10;
		}
		return result;
		
	}

}

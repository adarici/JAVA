package selfstudy01;

public class ForLoopQuestion01 {

	public static void main(String[] args) {
		/* Write a program to print counting numbers 
		 * from 10 ton 57 on the console by using for loop
		 */
		
		for(int i=10;i<58;i++) {
			if(i%2==0)
			continue;
			System.out.print(i+" ");
		}
	}

}

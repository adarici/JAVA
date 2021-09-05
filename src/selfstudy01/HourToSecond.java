package selfstudy01;

import java.util.Scanner;

public class HourToSecond {

	public static void main(String[] args) {
		// Ask user to enter 1 hour 10 minutes 50 second 
		//to convert 4250 seconds.
		
		 Scanner scan = new Scanner(System.in);
		 
		    System.out.println("enter hour");
		    int h = scan.nextInt();
		    System.out.println("enter minutes");
		    int m =scan.nextInt();
		    System.out.println("enter seconds");
		    int s =scan.nextInt();
		  
		    m=(h*60)+10;
		    s=(m*60)+50;
		  

		    System.out.println(s+ " seconds");
		    scan.close();
	}

}

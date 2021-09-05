package practiceclassday02;

import java.util.Scanner;

public class ChangeMailAdd {

	public static void main(String[] args) {
		//ask user to enter an e-mail address
        // then if it contains "hotmail" replace it with "gmail"
        // e.g: johnbrown@hotmail.com ==> johnbrown@gmai.com

		Scanner scan=new Scanner(System.in);
	       System.out.println("Please enter a hotmail add");
	      
	       //1. Way
	       String str =scan.nextLine();
	      str=str.replaceAll("hot", "g");
	      System.out.println(str);
	      
	      //2.WAY
	      if(str.contains("@hotmail")) {
	 		 System.out.println(str.replace("@hotmail.com","@gmail.com"));
	 	 }else {
	 		 System.out.println("Please enter correct hotmail address");
	 	 }
scan.close();


	
	}

}

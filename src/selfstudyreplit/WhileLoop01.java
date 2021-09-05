package selfstudyreplit;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a name and a character, 
		 * then check how many times the character is repeated in the name
		 *  using loops in the name

e.g:
char ch1= 'a' ;
String name =“John came late" 
Expected Output: Number of a = 2
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Pls, enter a name to check repeated character");
		String name = scan.nextLine();
		System.out.println(" Enter a character");
		char ch=scan.next().charAt(0);
	
		int count=0,i=0;
		
		while(i<name.length()){
		
			if(ch==name.charAt(i)){
				count++;		
			}
		i++;
		}
		System.out.println(count);
		scan.close();
	}
}

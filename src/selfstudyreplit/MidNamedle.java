package selfstudyreplit;

import java.util.Scanner;

public class MidNamedle {

	public static void main(String[] args) {
		/*
		 Create 2 words : name1 and name2
if the name1 has even numbers of characters,
then insert the second word in the middle of the first name
if the first word has odd numbers
Then print the “Name2 cannot be inserted in the name1”
e.g:
name1= mehmet
name2= ahmet
Print ==> mehahmetmet
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name.");
		String name1=scan.nextLine();
		System.out.println("Enter second name.");
		String name2 = scan.nextLine();
		
		if(name1.length()>3 && name1.length()%2==0) {
			//1. Way
//		String str1=name1.substring(0,name1.length()/2);
//		String str2=name1.substring(name1.length()/2);
//		System.out.println(str1+name2+str2);
			
			// 2. Way
		System.out.println(name1.substring(0,name1.length()/2)+name2+(name1.substring(name1.length()/2)));
		}else {
			System.out.println("Name2 cannot be inserted in the name1");
		}
scan.close();



	}

}

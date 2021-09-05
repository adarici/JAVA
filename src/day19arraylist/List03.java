package day19arraylist;

import java.util.ArrayList;

import java.util.Scanner;

public class List03 {

	public static void main(String[] args) {
		// 
		ArrayList<Character> list1 = new ArrayList<>();
		list1.add('B');
		list1.add('E');
		list1.add('A');
		list1.add('S');
		list1.add('F');
		
		System.out.println(list1);

		// How to check an array list contain a specific element
		
		System.out.println(list1.contains('B'));
		System.out.println(list1.contains('C'));
		
		ArrayList<Character> list2 = new ArrayList<>();
		list2.add('B');
		list2.add('E');
		list2.add('A');
		list2.add('S');
		list2.add('F');
		
		System.out.println(list2);
		// how to check 2 list are equal or not
		
		System.out.println(list1.equals(list2));
		
		
		ArrayList<Character> list3 = new ArrayList<>();
		list3.add('B');
		list3.add('E');
		list3.add('A');
		list3.add('S');
		list3.add('F');
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Pls, Enter a letter");
	char ch = scan.next().toUpperCase().charAt(0);
		
		if(list1.contains(ch)) {
			list1.set(list1.indexOf(ch), '$');
		}else {
			list1.add(ch);
		}
		System.out.println(list1);
		
	scan.close();
	}

}

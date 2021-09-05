package day19arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReviewArrays {

	public static void main(String[] args) {
		ArrayList<Integer> list1= new ArrayList<Integer>();
		ArrayList<Integer>list2=new ArrayList<>();
		ArrayList<Integer>list3=new ArrayList<Integer>();
		
		list1.add(0);
		list1.add(11);
		list1.add(21);
		
		list2.add(20);
		list2.add(13);
		list2.add(22);
		
		list3.add(0);
		list3.add(12);
		list3.add(21);
		
		System.out.println("1: "+list1);
		System.out.println("2: "+list2);
		System.out.println("3: "+list3);
		
		list1.add(1, 20);
		System.out.println("after ading list1: "+list1);
		Collections.sort(list2);
		System.out.println("Asending list of list2: "+list2);
		
		
		list3.set(2, 11);
		System.out.println("set(): "+list3);
		
		System.out.println("contains(); "+list2.contains(11));
		

	}

}

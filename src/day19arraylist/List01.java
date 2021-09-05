package day19arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class List01 {

	public static void main(String[] args) {
		
		/*
		 * Array Lists are resizeable
		 * we can store nonprimitives
		 * we can not store multiple data types
		 */
		
		// crrating an array list
		ArrayList<Integer> list1 = new ArrayList <Integer>();
//		ArrayList<Integer> list2 = new ArrayList <>();
//		List<Integer> list3 = new ArrayList <Integer>();
		
		list1.add(33);
		list1.add(4);
		list1.add(7);
		list1.add(6);
		list1.add(13);
		list1.add(12);
		list1.add(27);
		System.out.println(list1);
		
		// how to add specific elements in array
		
		list1.add(3, 8);
		System.out.println(" After adding 8 into index 3rd: "+list1);
		
		// how to sort Arraylist asending
		Collections.sort(list1);
		System.out.println("After sorting: "+list1);
		
		// How to sort an array list in desending order
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("sort in desending: "+list1);
		
		// How to print specific element from an array list
		System.out.println(list1.get(2));
		System.out.println(list1.get(5));
		
		// How can we get number of elements in an Array list
		
		System.out.println("the number of elements: "+list1.size());
		
		// create an Array list and print min and max values
		ArrayList<Integer> listnum = new ArrayList <Integer>();

		listnum.add(6);
		listnum.add(10);
		listnum.add(15);
		listnum.add(36);
		
		Collections.sort(list1);
		System.err.println("min element:"+listnum.get(0));
		Collections.sort(listnum,Collections.reverseOrder());
		System.err.println("max element:"+listnum.get(0));
		System.err.println("min element:"+listnum.get(listnum.size()-1));
		
		
		
	}

}

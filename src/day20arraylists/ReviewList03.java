package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class ReviewList03 {

	public static void main(String[] args) {
		/*
		 * Create a method to delete odd elements 
		 * and multiply even elements by 3 from the list
		 */
	List<Integer> list1 =new ArrayList<>();
	List<Integer> list2 =new ArrayList<>();
	List<Integer> list3 =new ArrayList<>();
	
	list3.add(0);
	list3.add(3);
	list3.add(20);
	list3.add(22);
	
	list2.add(11);
	
	list1.add(3);
	list1.add(9);
	list1.add(10);
	list1.add(12);
	list1.add(3);
	list1.add(9);
	list1.add(10);
	list1.add(12);
	
	
	deleteOddMultiplyEven(list1);
	deleteOddMultiplyEven(list2);
	deleteOddMultiplyEven(list3);
}
	
	public static void deleteOddMultiplyEven(List<Integer>list1) {
		for(int i = 0; i<list1.size();i++) {
			if(list1.get(i)%2!=0) {
				list1.remove(i);
				i--;
				
			}else {
				list1.set(i, list1.get(i)*2);
			}
		}System.out.println(list1);
		
}
}


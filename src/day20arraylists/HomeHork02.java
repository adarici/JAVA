package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class HomeHork02 {

	public static void main(String[] args) {
		/* Given a list of integers,
		 return a list where each integer is multiplied with itself.
		 please create a method which multiplies all the elements by itself 
		 and then call it from the main method
		 */
		
		List<Integer> list =new ArrayList<>();
		
		list.add(2);
		list.add(4);
		list.add(6);
		
		multiply(list);
	}
		
		public static void multiply(List<Integer>list) {
			for(int i =0;i<list.size();i++) {
				list.set(i, list.get(i)*list.get(i));
			}
			System.out.println(list);
		
	}

}

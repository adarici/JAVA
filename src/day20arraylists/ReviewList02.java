package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class ReviewList02 {

	public static void main(String[] args) {
		// create a method which increase the elements by 2
		
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(6);
		list.add(10);
		
		for(int i =0; i<list.size();i++) {
			list.set(i,list.get(i)*2);
		}System.out.println(list);

	}

}

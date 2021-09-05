package day20arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReviewList01 {

	public static void main(String[] args) {
		List <Integer> listnum = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        listnum.add(17);
        listnum.add(23);
        listnum.add(11);
        listnum.add(17);
        listnum.add(3);
        listnum.add(5);
        listnum.add(8);
        listnum.add(-5);
        listnum.add(-3);
        System.out.println(listnum);
        System.out.println(list2.isEmpty());
        System.out.println("remove 3: "+listnum.remove(3));
        System.out.println("remove 5: "+listnum.remove(5));
       
        
        List<Integer> list1 = new ArrayList<>();
        list1.add(27);
        list1.add(15);
        list1.add(312);
        list1.add(28);
        list1.add(14);
        list1.add(162);
        list1.add(61);
        list1.add(39);
        list1.add(121);
        list1.add(16);
        list1.add(18);
        
	List<Integer> difference= new ArrayList<>();
	for(int i = 0; i<list1.size();i++) {
		for(int j = 0; j<listnum.size();j++) {
			difference.add(list1.get(i)-listnum.get(j));
		}
	}System.out.println(difference);
	
	Collections.sort(difference);
	System.out.println(difference);
	System.out.println("MIn value: "+difference.get(0));
	System.out.println("Max value: "+difference.get(difference.size()-1));
        
	}

}

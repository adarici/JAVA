package day20arraylists;

import java.util.ArrayList;


public class List04 {

	public static void main(String[] args) {
	
		ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(23);
        list1.add(12);
        list1.add(11);
        list1.add(13);
        list1.add(10);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(25);
        list2.add(2);
        list2.add(17);
        list2.add(18);
        list2.add(1);
        list2.add(115);
        
        ArrayList<Integer> list3 = new ArrayList<>();
        
        System.out.println(list1.addAll(list2));
        System.out.println(list1);
        
System.out.println(list1.addAll(list3));

ArrayList<Integer> list4 = new ArrayList<>();
list4.add(12);
list4.add(121);
list4.add(125);
// adding list4 into the index 2
list1.addAll(2, list4);
System.out.println(list1);
list1.clear();
System.out.println(list1);



	}

}

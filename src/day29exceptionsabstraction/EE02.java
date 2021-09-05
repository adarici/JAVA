package day29exceptionsabstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EE02 {

	public static void main(String[] args) {
//		// stringOutOfBoundException
//		
//		String string = "Learning Java is so easy";
//		System.out.println(string.charAt(5));
//		
//		System.out.println(string.charAt(27));
		
		//IllegalStateException
		// when we try to use a method at an inapproprite time
		
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(23);
		list.add(45);
		
		Iterator<Integer>listr = list.iterator();
		listr.next();
		listr.remove();
		

	}

}

package day19arraylist;

import java.util.ArrayList;

public class List02 {

	public static void main(String[] args) {
		// How to update an element
		
		ArrayList<String> listStr = new ArrayList<>();
		listStr.add("Ali");
		listStr.add("Veli");
		listStr.add("Bahar");
		listStr.add("Zeki");
		listStr.add("Umay");
		listStr.add("Mmuhammet");
		listStr.add("Kaan");
		listStr.add("Leyla");
		
		System.out.println(listStr);
		
		// set() = remove+add;
		// We use set() to update a value of an element
		listStr.set(1, "Selen");
		System.out.println("After update: "+listStr);
		
		listStr.set(listStr. indexOf("Ali"),"Mecnun");
		System.out.println("After update: "+listStr);
		
		
	}

}

package day32collections;

import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
/*
 1- it will put the element in natural order
 2- ordering takes time so it works slower
 3- element are unique and in natural order
 	alphabetical or from smallest to bigger
 4- it will overwrite the previous element when we try same one	
 */
		TreeSet<String> tset1 = new TreeSet<>();
		tset1.add("Tulip");
		tset1.add("Rose");
		tset1.add("Iris");
		tset1.add("Lily");
		tset1.add("Daisy");
		System.out.println(tset1);
		// Java puts our elements in alphabetical order
		tset1.add("Lily");
		System.out.println(tset1);
		// if we try to add an element again it will overwrite the first one
		tset1.add("Zerrin");
		System.out.println(tset1);
		
		System.out.println(tset1.ceiling("Rose"));
		System.out.println(tset1.ceiling("Loo"));//Rose
		System.out.println(tset1.ceiling("Zoo"));//null
		// it will give equal one or the greater we provide
		
		System.out.println(tset1.floor("Re"));//Lily
		// floor method will bring the same one or the smaller one than we provide
		System.out.println(tset1);
		System.out.println(tset1.descendingSet());
		// it will put the elements in descending order
		
		System.out.println(tset1.headSet("Rose"));
		// It will returns the elements up to the argument we provide
		
		System.out.println(tset1.headSet("Rose", true));
		System.out.println(tset1.tailSet("Lily"));
		// it will bring the elements starting from the element we provide to the end
		
		System.out.println(tset1.higher("Rose"));//Tulip
		// it will return the greater one.
		
		System.out.println(tset1.lower("Lily"));//Iris
		// it will return the smaller one.
		
		
	}

}

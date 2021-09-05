package day23stringbuilder;

public class StringBuilders02 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("I love Java");
		StringBuilder sb2 = new StringBuilder("I love Java");
		// how to compare 
		/* in string builders equals() method works like "==" sign
		 * it checks value and references
		 */
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(sb1));
		// to get the index of specific character
		System.out.println(sb1.indexOf("e"));//5
		System.out.println(sb1.indexOf("a"));//8

		System.out.println(sb1.indexOf("s"));//-1 doesn't exist
		
		// insert (off set, String)
	System.out.println(sb1.insert(7, "the "));
	
	// insert (to add part of a String into the specific index
	sb1.insert(1, "and , Asyalar", 3, 10 );
	System.out.println(sb1);
	
	// reverse
	sb1.reverse();
	System.out.println(sb1);
	
	sb1.reverse();
	System.out.println(sb1);
	
	//replace
	sb1.replace(2, 8, "*");
	System.out.println(sb1);
	sb1.replace(8, 13, "");
System.out.println(sb1);

//set a char
sb1.setCharAt(7, ' ');
System.out.println("Before trim: "+sb1.capacity());

// trim
// 
sb1.trimToSize();
// sb1.length();// gives a result as before trim
System.out.println("After trim: "+sb1.capacity());
sb1.append(" and Selenium");
System.out.println("After append: "+sb1.capacity());

	}

}

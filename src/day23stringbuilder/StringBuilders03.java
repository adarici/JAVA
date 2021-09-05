package day23stringbuilder;

public class StringBuilders03 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("I love Java");
		StringBuilder sb2 = new StringBuilder("I love Java");
		// how to handle this?
		// we can convert them in to the String
		System.out.println(sb1.toString().equals(sb2.toString()));
		// compareTo();
		// it will give "0" if they have same characters 
		// it will give "-1" if they are not same
		System.out.println(sb1.compareTo(sb2));
		

	}

}

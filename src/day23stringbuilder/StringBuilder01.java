package day23stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// String is immutable and Java create String builder to handel this
		
// how to create a String Builder
		
		// 1st way
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		System.out.println("The default value of the capacity is: "+sb.capacity());
		
		// to add something in to the String Builder
		sb.append("Ali");
		System.out.println(sb);
		
		sb.append(" DARICI");
		System.out.println(sb);
		//StringBuilder sb = new StringBuilder();capacity is default means 16
		//StringBuilder sb = new StringBuilder(5);capacity is 5
		System.out.println("The default value of the capacity is: "+sb.capacity());
		
		String name = "Zerrin";
		name.toUpperCase();
		System.out.println(name);
		System.out.println(name.toUpperCase());
		
		// when we update StringBuilder with new one prints olways new one
		sb.append(" is one of the best qa Engineer");
		System.out.println(sb);
		
		//2. way with paremeter
		StringBuilder sb1 = new StringBuilder ("Fatih");
		System.out.println(sb1);
		sb1.append(" and Busra will find a job in a short time");
		System.out.println(sb1);
		System.out.println("The default value of the capacity is: "+sb1);
		
		//3. way with capacity
		StringBuilder sb3 = new StringBuilder(3);
		sb3.append("Ali");
		System.out.println(sb3);
		sb3.append(" DARICI");
		System.out.println(sb3);
	
		// chaining 
		
		StringBuilder sb4 = new StringBuilder("Java");
		sb4.append("+").append("Selenium").append("+").append("SQL");
		System.out.println(sb4);
		
		// to append some chars between specific indexes
		
		sb4.append(sb4, 4, 13);
		System.out.println(sb4);
		
		StringBuilder sb5 = new StringBuilder("Ayse");
		System.out.println(sb5);
		sb5.append(" Ozipek",0,3);
		System.out.println(sb5);
		
		// to get a character from a specific index
		
		System.out.println(sb5.charAt(5));
		
		// to delete some characters between specific indexes
		
		System.out.println("sb4 before delete: " +sb4);
		sb4.delete(0, 5);
		System.out.println("sb4 after delete: " +sb4);
		
		// to delete a specific character from specific index
		
		sb4.deleteCharAt(10);
		System.out.println(sb4);
		
		
		
	}

}

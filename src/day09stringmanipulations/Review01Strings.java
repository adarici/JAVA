package day09stringmanipulations;

public class Review01Strings {

	public static void main(String[] args) {
		
		String str ="Afra Zerrin";
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("r"));
		System.out.println(str.indexOf("Zer"));
		System.out.println(str.indexOf("farn"));
		System.out.println(str.indexOf("a",2));
		System.out.println(str.indexOf("r",7));
		System.out.println(str.indexOf("er",6));
		
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.lastIndexOf("r"));
		System.out.println(str.lastIndexOf("f"));
		System.out.println(str.lastIndexOf("a",3));
		
		
	}
	

}

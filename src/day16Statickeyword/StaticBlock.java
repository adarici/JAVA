package day16Statickeyword;

public class StaticBlock {
	static int age;
	static int year=2020;
	
	static {
		// we use static block to initialize our static variables
		// if we have more then 1 static block, it will work in order
		age=21;
		
	}
	static {
		
		System.out.println("static 1");
	}
	static {
		System.out.println("static 2");
	}
	static {
		System.out.println("static 3");
	}

	public static void main(String[] args) {

test1();
System.out.println("this is my main method");
test2();
test3();

	}
public static void test1() {
	System.out.println("test1");
}
public static void test2() {
	System.out.println("test2");
}
public static void test3() {
	System.out.println("test3");
}
}

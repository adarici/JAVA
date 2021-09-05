package day14methodoverloadingconstruction;

public class MethodOverloading01 {

	public static void main(String[] args) {
		/*
		 Whole numbers are accepted as int for Java as default
		 Decimal numbers are accepted as double for Java as default
		 */
		
				System.out.println(add(2,3));
				System.out.println(add(2.5,3));
				System.out.println (add(3,2.5));
				System.out.println(add(3,6,6.2));
				add();  //varargs is accepting 0 arguments
				add(3);
				add(3,5.2); //because exact match with int int thats why Java is reading the easiest one..vararags if there is argument(redunderline)
				add(4, 6);
				add(1,2,3,4,5);
			}
			
				/*
				  As you see in the examples, I created a method add 2 values and I created a different method to add 3 values.
				  If user wants to add 4 values I need one more method but this is not sensible because it is endless
				  
				  For that issue, Java created "varargs", varargs accept ant number of values....
				 */
			
			
			public static int add(int...a) {
				System.out.println("I am using varargs...");
				return 1;
			}
			public static double add(int a, int b) {
				System.out.println("int + int");
				return a+b;
			}
			public static double add(double a, int b) {
				System.out.println("double + int");
				return a+b;
			}
			public static double add(int a, double b) {
				System.out.println("int + double");
				return a+b;
			}
			public static double add(double a, double b) {
				System.out.println("double + double");
				return a+b;
			}
			public static double add(int a, int b, double c) {
				System.out.println("int + int + double");
				return a+b;
			}
			
			}
	


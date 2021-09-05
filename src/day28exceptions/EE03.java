package day28exceptions;

public class EE03 {

	public static void main(String[] args) {
		/*
         * 1)ArrayIndexOutOfBoundsException 
         *   unchecked exception
         *   when we try to get an element from an unexisting  index
         *   
         *   2)ClassCastException is unchecked exception
         *   when we try to cast a data type into another one which is not supported. 
         * 
         * 3)NumberFormatException
         * unchecked exception
         * when we try to convert non-digit chars to the integer by using parseInt
         * 
         */
		
		// ArrayIndexOutOfBoundsException
//		String s[] = {"Ali", "Zerrin","Fatih","Busra"};
//		System.out.println(s[1]);
//		try {
//		System.out.println(s[6]);
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(" Pls, check the length of your array "+e.getMessage());
//		}
		// ClassCastException
		
//		Object o = 43;
//		
//		//String num =o;
//		
//		String num=(String)o;//ClassCastException
		
		
		// NumberFormatException
		
		String s1 = "123";
		System.out.println("Before convert "+s1);//Before convert 123
		int num1 =Integer.parseInt(s1);// convert our String in to integer
		System.out.println("After convert "+(num1+2));//After convert  123 in to int
		
		String s2 = "2e4r5t";
		try {
		int num2 = Integer.parseInt(s2);
		System.out.println(num2);// NumberFormatException
		}catch(NumberFormatException e) {
			System.out.println(" You try to convert unnumerical characters... ");
		}
		
		
	}

}

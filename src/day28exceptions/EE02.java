package day28exceptions;

public class EE02 {

	public static void main(String[] args) {
		/*
		 * NullPointerException is unchecked exception==> run time exception
		 * when we try to get sth which is null
		 * 
		 * we can not use "try block" alone
		 * a) try+catch
		 * b)try+multiple catch
		 * c)try+catch+finally  /   try+multiple catch+finally
		 * d)try+finally
		 * 
		 * we can use finally to close our file or database. it will be executed in any condition
		 * if we do not close our database 
		 * it can cause some security problems
		 * data leakage
		 * it means you will pay a lot to the cloud company
		 */
		
	String str1 ="";
	System.out.println(str1.length());
 String str2 = null;
try {
 
 System.out.println(24/0);
 System.out.println(str2.length());// NullPointerException
	
}catch(NullPointerException e) {
		System.out.println(" Please do not use length() method for null object");
	
}catch(ArithmeticException e) {
		System.out.println(" Pls do not try to divide a number by 0 ");
	}finally {
		System.out.println("This will be printed any condition");
		System.out.println("Java says Enough of your problems");
	}
System.out.println(" I love Java");
	}
}

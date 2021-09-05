package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

	/*
	 	1)FileNotFoundException: 
	 		a)The file with the specified path does not exist
	 		b)If the is unaccessible 
	    2)IOException:
	        a)It can handle all exceptions about Input and Output
	    Note: IOException is the parent of FileNotFoundException
	    Note: If you are using IOException Class, no need to use FileNotFoundException Class
	    
	    Note: When you see an Exception, you have 2 options
	    		a)Using "throws" declaration in the method name line
	    		b)Using try-catch block
	 */

public class E01 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/day27exceptions/RevTextFile");
		
		
		int i = 0;
		while((i = fis.read()) != -1) {
			System.out.print((char)i);			
		}	
		System.out.println("========");
		
		FileInputStream fis1 = new FileInputStream("src/day27exceptions/TextFile01");
		int j = 0;
		while((j = fis1.read()) != -1) {
			System.out.print((char)j);			
		}	fis.close();
		fis1.close();
	}

}
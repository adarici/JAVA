package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RevE02 {

	public static void main(String[] args) throws IOException {
	try {
			
			FileInputStream fis = new FileInputStream("src/day27exceptionsX/TextFile01");
			
			int i = 0;
			
			while((i = fis.read()) != -1) {
				System.out.print((char)i);			
			}
			
		} catch (FileNotFoundException p) {

			System.err.println("I think the path is wrong or file does not exist... ");
			p.printStackTrace();//To get detailed error message use that one
			System.out.println(p.getMessage());//To get a short error message use that one
	}
	}
}


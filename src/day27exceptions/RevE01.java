package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RevE01 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream ("src/day27exceptions/RevTextFile"); 
		int i = 0;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
		/*
		 Exception:
		 1. FileNotFoundException: only help to access the data not read --bilgiye ulasabilmek icin
		 2. IOException is parent access data and read --bilgiyi okuyabilmes
	 */
			}
		
	}

}

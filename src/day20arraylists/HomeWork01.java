package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class HomeWork01 {

	public static void main(String[] args) {
		/*please write a method which adds * to the all elements
		 "aa","bab","ab""ac"
		 */
		List<String> str = new ArrayList<>();
		
		str.add("aa");
		str.add("ab");
		str.add("ac");
		str.add("aba");
		str.add("baba");
		
	str(str);
}
public static void str (List<String>str) {
	for(int i =0; i<str.size();i++) {
		str.set(i, str.get(i)+"^^");
	}
System.out.println(str);
		
	}
	

	}



package practiceclassday04;


public class Question02 {
/*
		 * 2. removeDuplicate(str:"aaaa");Write method that accepts a String and removes 
		 * all duplicate from String. EX : aaabbc --> abc
		 */

static String removeDuplicates(String str) {
	String result = "";
	for(int i = 0; i<str.length(); i++) {
		char eachLetter = str.charAt(i) ;
		if(!result.contains(eachLetter + "")) {
			result+=eachLetter;
		}
	}
	return result;
	
}

public static void main(String[] args) {
	System.out.println(removeDuplicates("aaaalidarici bbbaabbaa"));
				
	}
}

		


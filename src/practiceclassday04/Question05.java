package practiceclassday04;

public class Question05 {

/*
 * //5. Write a method that checks if word is palindrome. 
 * A palindrome is a word, number, phrase, 
 * or other sequence of characters 
 * which reads the same backward as forward, 
 * such as madam or racecar or the number 10801.
 */
	
	static boolean isPalindrome(String str) {
		
		for(int i =0,j=1; i<str.length();i++,j++) {
			if(str.charAt(i)!=str.charAt(str.length()-j))
			return false;
				
		}
		
		return true;
	
	}
	public static void main (String[]codingJavaIsFun) {
		
		System.out.println(isPalindrome("racecar"));
	}
}


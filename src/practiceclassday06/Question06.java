package practiceclassday06;

public class Question06 {

	public static void main(String[] args) {
		/*6. Write a function to check whether a string is pangram or not assuming
		that the string passed in does not have any punctuation.
		 Pangrams are words or sentences containing every letter of 
		 the alphabet at least once. 
		 EX: The quick brown fox jumps over the lazy dog --> true
		 */
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPangram(str.toLowerCase()));
		
	}
	public static boolean isPangram(String str) {
		for ( char i = 'a'; i < 'z'; i++) {
			if(!str.contains(i+"")) {
				return false;
			}
			
		}return true;
	}

}

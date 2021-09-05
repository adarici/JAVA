package practiceclassday04;

public class Question04 {
	public static void main(String[] args) {
		System.out.println(isReverse("123456"));
		
	}

/*
		 * 4. Write a method that accepts a String 
		 * and returns reverse of the same String. 
		 * EX: java -> avaj
		 */

 static String isReverse(String str){
    String reversedString = "";
    for(int i = str.length() - 1; i >= 0; i--)
        reversedString += str.charAt(i);
    return reversedString;
 }
	
	
}


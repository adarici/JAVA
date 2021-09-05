package workshopday06;

import java.util.Arrays;

public class ForWhileReplit03 {

	public static void main(String[] args) {
		/*
		 * Write a code that returns the duplicate chars in a String array.
		 * (interview Question06)
Input :
String str=“Javaisalsoeasy”
Output: [a, s]
		 */
		String str="Javaisalsoeasy";
		String s ="";
		
		for(int i = 0;i<str.length();i++) {
			
			for (int j = i+1; j < str.length(); j++) {
				
				if(str.substring(i,i+1).equals(str.substring(j,j+1))) {
					if(!s.contains(str.substring(i,i+1)))
					s=s+str.substring(i,i+1);
				}
			}
		}
		
		System.out.println(s);
		String arr[]=s.split("");
		System.out.println(Arrays.toString(arr));
	}

}

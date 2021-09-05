package day12loops;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		/*
		 For the String “1234_?!abcdef”, 
		 type a code to count the number of letters,
		 the number of digits and the number of others by using
			do-while loop
		 */
		String str = "1234_?!abcdef";
		
		int digitsCounter =0;
		int letterCounter =0;
		int othersCounter=0;
		
		int i = 0;
		
		do {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				letterCounter++;
			}else if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				digitsCounter++;
			}else {
				othersCounter++;
			}
			i++;
		}while(i<str.length());
		
		System.out.println("Letters: "+letterCounter);
		System.out.println("Digits: "+digitsCounter);
		System.out.println("Others: "+othersCounter);

	}

}

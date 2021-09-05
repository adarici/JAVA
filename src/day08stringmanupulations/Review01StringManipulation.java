package day08stringmanupulations;

public class Review01StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stubString str1 = "Ali";
		
		String str1 = "Ali";
		String str2 = " BABA";
		System.out.println(str1+str2);
		
		System.out.println(str1.concat(str2)+" DARICI");// Ali BABA DARICI
		System.out.println(str1.concat(str2+ " DARICI afra"));
		
		String str3 = "Zerrin DArici";
		System.out.println(str3.replace("rici", "RICI"));// Zerrin DARICI
		System.out.println(str3.replace("Zerrin", "Afra"));// Afra DArici
		
		String str4 = "4000 ";
		System.out.println(str4.replace(" ", ".00€"));
		System.out.println(str4.replace("", "_"));//_4_0_0_0_ _
		
		System.out.println(str3.lastIndexOf("r",3));//3
		System.out.println(str3.lastIndexOf('Z'));
		System.out.println(str3.indexOf("Z"));
		System.out.println(str3.startsWith("Z"));
		System.out.println(str3.endsWith("i"));
		System.out.println(str3.indexOf("i",2));
		System.out.println(str3.startsWith(" ",6));//true
		 
		String str5 = "Ali BABA";
		String str6 = "ali baba";
		String str7 = "";
		System.out.println(str5.replace("A", "_"));// _li B_B_
		System.out.println(str5.replace("", "-"));//-A-l-i- -B-A-B-A-
		System.out.println(str5.charAt(5));//A
		System.out.println(str5.indexOf("Z"));//-1
		System.out.println(str6.equals(str5));//false
		System.out.println(str6.equalsIgnoreCase(str5));//true
		System.out.println(str5.contains("i"));//true
		System.out.println(str5.contains("c"));//false
		System.out.println(str7.isEmpty());//true
		System.out.println(str6.isEmpty());//false

	}

}

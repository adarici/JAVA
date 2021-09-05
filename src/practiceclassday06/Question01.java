package practiceclassday06;

public class Question01 {
	/*
	 1.A sandwich is two pieces of bread with something in between.
	  Print the string that is between the first and last appearance of
	  "bread" in the given string, or return string "nothing" if there 
	  are not two pieces of bread.Ex: breadozkanbread--> ozkan,
	  breadozkan--> nothing
	 */
	static String isSandivic(String str) {
		
		int first=str.indexOf("bread");
		int second=str.lastIndexOf("bread");
		if(first==second) return "nothing";
		else 
		return str.substring(first+5,second);
		
	}
	
	public static void main(String[] args) {	
System.out.println(isSandivic("breadozkanbread"));
System.out.println(isSandivic("breadozkan"));

	}

}

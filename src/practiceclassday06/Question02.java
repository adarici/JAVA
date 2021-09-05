package practiceclassday06;

public class Question02 {

	public static void main(String[] args) {
	/*
	 2.Print true if the string "java" and "python" appear the same 
	 number of times in the given string word. 
	 Ex: javajavajavapythonpythonpython--> true
	 */	
		
	System.out.println(isCountSame("javajavapythonpythonpythonjava"));

	}
	
	static boolean isCountSame(String str) {
		
		int countJava, countPython;
		countJava=countPython=0;
		for (int i = 0; i < str.length()-5; i++) {
			if(str.substring(i,i+4).equalsIgnoreCase("java"));
			countJava++;
			if(str.substring(i,i+6).equalsIgnoreCase("python"));
			countPython++;
		}
		
		
		return countJava==countPython;
	}
}

package practiceclassday06;

import java.util.ArrayList;

public class Question05 {

	public static void main(String[] args) {


 /*5. Write a method that collects the all positive Armstrong numbers 
		up to the number that is passed in. Armstrong is a number that is equal
		to the sum of its own digits and each digit being raised to the 
		power of the number of digits. EX: 371 = 3^3 + 7^3 + 1^3 => 371	
		*/
				/*
			     * @param num
			     * @return the number of digits
			     */
 
 
System.out.println(zaf(153));

System.out.println(armst(10000));
	}
	public static boolean zaf(int a) {
		int rem = 0;
		double sum=0;
		int temp = a;
		int counter=(""+a).length();
		while(a>0) {
			rem=a%10;
		sum=sum+(Math.pow(rem, counter));
		a=a/10;
		
		}return (temp==sum);
	}
	public static ArrayList<Integer> armst(int num){
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <num; i++) {
			if(zaf(i)) {
				list.add(i);
				
			}
		}return list;
	}
	
	

}

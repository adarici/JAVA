package practiceclassday05;

import java.util.Arrays;
import java.util.Random;

public class Question02 {
/*
 Write a method that checks to see if two words are Anagram or not. 
 EX: read and dear  --> true
 */
    static boolean isAnagram(String str1, String str2){
        //toCharArray
        //split()
        String[] arr1 = str1.split("");
       // char[] arr1 = str1.toCharArray();
        String[] arr2 = str2.split("");
        //char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

//    static int[] singleArrayGenerator(int num){
//        int[] arr = new int[num];
//        for(int i = 0; i < num; i++)
//            arr[i] = new Random().nextInt(100);
//        return arr;
//    }
	
	public static void main(String[] args) {
		 System.out.println(isAnagram("elbow", "below"));

	}

}

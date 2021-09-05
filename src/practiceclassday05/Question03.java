package practiceclassday05;

import java.util.Arrays;
import java.util.Random;

public class Question03 {
    /*
     Write a method that accepts an Array of integers and returns 
     the max and the secondMax.
     */
	  static int[] singleArrayGenerator(int num){
	        int[] arr = new int[num];
	        for(int i = 0; i < num; i++)
	            arr[i] = new Random().nextInt(100);
	        return arr;
	    }
    static String findMaxs(int[] arr){
        int max = Integer.MIN_VALUE + 1;
        int secondMax = Integer.MIN_VALUE;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int num : arr){
            if(num > max) {
                secondMax = max;
                max = num;
            }else if(num > secondMax && num != max)
                secondMax = num;
        }
        return "max is " + max + " secondMax is " + secondMax;
    }
	public static void main(String[] args) {
		System.out.println(findMaxs(singleArrayGenerator(10)));

	}

}

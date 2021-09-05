package practiceclassday06;

import java.util.Arrays;
import java.util.Random;

public class Question04 {

	public static void main(String[] args) {
		// 4.Given a 2dimention array of ints, find the biggest number(int) in the array
		// and print it.
			System.out.println(max(arrayGenerator(4,3)));

		}
		static int[][] arrayGenerator(int outer, int inner){
			int [][] arr= new int [outer][inner];
			for (int i = 0; i < outer; i++) {
				for (int j = 0; j < inner; j++) {
					arr[i][j]= new Random().nextInt(50);
					
				}
			}System.out.println(Arrays.deepToString(arr));
			return arr;
		}
		public static int max(int [][]array) {
			int max=0;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if(max<array[i][j]) {
						max=array[i][j];
					}
				}
			}return max;
		}
		}


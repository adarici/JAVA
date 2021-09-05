package day18arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		/* How to check if a specific element exist in an array or not
		 * 1) use sort()
		 * 2)Then use binarySearch()
		 */
		char crr[] = {'c','A','k','m'};
		// Check of 'x' exist in crr?
		// 1) use sort()
		Arrays.sort(crr);
		// 2) Step
		// If an element does not exist it returns negative order (Order number if the element exist)
		System.out.println(Arrays.binarySearch(crr, 'x')); //-5 order of element
		System.out.println(Arrays.binarySearch(crr, 'e')); //-3 order of element
		System.out.println(Arrays.binarySearch(crr, 'Z')); //-2 order of element
		System.out.println(Arrays.binarySearch(crr, 'l')); //-4 order of element
		// 
		System.out.println(Arrays.binarySearch(crr, 'c')); // 1 index of element
	}

}

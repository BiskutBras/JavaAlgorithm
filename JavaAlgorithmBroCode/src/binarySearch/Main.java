package binarySearch;

//import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// binary search

		int array[] = new int[10];
		int target = 6;

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

// 		int index = Arrays.binarySearch(array, target);
		int index = binarySearch(array, target);

		if (index != -1) {
			System.out.println("Element " + target + " found at index: " + index);
		} else {
			System.out.println("Element not found!");
		}

	}

	private static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int middle = low + (high - low) / 2;
			int value = array[middle];

			System.out.println("middle: " + middle);

//			3 case for target position
			if (value < target)
				low = middle + 1;
			else if (value > target)
				high = middle - 1;
			else
				return middle;

		}
		
		return -1; //	not found
	}

}

package binarySearch;

public class Test {
	public static void main(String[] args) {

		int[] arr = new int[1000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		int target = 345;

		int index = binarySearch(target, arr);

		if (index != -1) {
			System.out.println(index);
		} else {
			System.out.println("not found!");
		}

	}

	private static int binarySearch(int target, int[] arr) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int middle = low + (high - low) / 2;

			if (target > arr[middle]) {
				low = middle + 1;
			} else if (target < arr[middle]) {
				high = middle - 1;
			} else {
				return middle;
			}

		}

		return -1;
	}
}

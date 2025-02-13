package linearSearch;

public class Test {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 9;

		int index = linearSearch(arr, target);

		if (index != -1) {
			System.out.println("The element " + target + " found at index: " + index);
		} else {
			System.out.println("Element not found!");
		}

	}

	private static int linearSearch(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1;
	}

}

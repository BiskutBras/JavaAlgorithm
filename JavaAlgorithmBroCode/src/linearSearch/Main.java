package linearSearch;

public class Main {

	public static void main(String[] args) {
		// linear search
		// run time complexity: O(n)
//test

		int[] array = { 3, 6, 1, 5, 2, 9, 7, 4, 8, 0 };
		int value = 4;

		String string = "";
		for (int i = 0; i < array.length; i++) {

			string += array[i] + ", ";

		}
		System.out.println("[" + string.substring(0, string.length() - 2) + "]");

		int index = linearSearch(array, value);

		if (index != -1) {
			System.out.println("Element " + value + " found at index: " + index);
		} else {
			System.out.println("Element not found!");

		}

	}

//	linear search
	private static int linearSearch(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;

	}

}

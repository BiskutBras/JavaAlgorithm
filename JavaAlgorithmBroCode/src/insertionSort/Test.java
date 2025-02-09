package insertionSort;

public class Test {

	public static void main(String[] args) {

		InsertionSort sorter = new InsertionSort();

		int[] arr = { 1, 4, 3, 5, 2, 8, 9, 7, 0, 6 };

		sorter.insertionSort(arr);
		print(arr);

	}

	private static void print(int[] arr) {
		String str = "";

		for (int i : arr) {

			str += i + ", ";

		}

		str = str.substring(0, str.length() - 2);
		System.out.println("[" + str + "]");

	}

}

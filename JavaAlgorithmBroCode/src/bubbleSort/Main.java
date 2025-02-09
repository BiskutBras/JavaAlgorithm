package bubbleSort;

public class Main {

	public static void main(String[] args) {
		// bubble sort algorithm

		BubbleSort sorter = new BubbleSort();

		int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		sorter.bubbleSort(arr);
		print(arr);

	}

	static void print(int[] arr) {

		String string = new String();
		for (int i : arr) {

			string += i + ", ";

		}

		string = string.substring(0, string.length() - 2);
		System.out.println(string);
	}

}

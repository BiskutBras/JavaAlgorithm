package bubbleSort;

public class Main {

	public static void main(String[] args) {
		// bubble sort algorithm

		int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		bubbleSort(arr);
		print(arr);

	}

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}

		}

	}

	public static void print(int[] arr) {
		String string = new String();
		for (int i : arr) {

			string += i + ", ";

		}

		string = string.substring(0, string.length() - 2);
		System.out.println(string);
	}

}

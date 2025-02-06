package insertionSort;

public class Test {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 5, 2, 8, 9, 7, 0, 6 };

		insertionSort(arr);
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

	private static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int j = i - 1;
			int temp = arr[i];

			while (j >= 0 && arr[j] > temp) {

				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = temp;
		}

	}

}

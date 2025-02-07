package selectionSort;

public class Test {

	public static void main(String[] args) {

		int[] arr = { 1, 9, 8, 2, 4, 3, 5, 7, 6, 0 };
		selectionSort(arr);
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

	private static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[min]) {
					min = j;
				}

			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}

	}

}

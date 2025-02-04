package insertionSort;

public class Main {

	public static void main(String[] args) {
		// insertion sort

		int[] arr = { 3, 5, 4, 1, 2, 9, 8, 7, 6 };

		insertionSort(arr);

		for (int i : arr) {
			System.out.print(i + ", ");
		}

	}

	private static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > temp) {

//				shift element to the right
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = temp;
		}

	}

}

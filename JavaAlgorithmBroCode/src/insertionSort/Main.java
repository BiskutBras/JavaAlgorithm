package insertionSort;

public class Main {

	public static void main(String[] args) {
		// insertion sort

		int[] arr = { 3, 5, 4, 1, 2, 9, 8, 7, 6, 0 };

		insertionSort(arr);
		print(arr);

	}

	static void print(int[] arr) {
		if (arr.length == 0) {
			System.out.println("[]");
		} else {
			String str = new String();

			for (int i : arr) {
				str += i + ", ";
			}
			str = str.substring(0, str.length() - 2);
			System.out.println("[" + str + "]");
		}

	}

	static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int j = i - 1;
			int temp = arr[i];

			while (j >= 0 && arr[j] > temp) {

//				shift element to the right
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = temp;
		}

	}

}

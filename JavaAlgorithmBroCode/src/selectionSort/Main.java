package selectionSort;

public class Main {

	public static void main(String[] args) {
		// selection sort

		int[] arr = { 2, 3, 4, 7, 6, 5, 9, 1, 8 };

		selectionSort(arr);

		for (int i : arr) {
			System.out.print(i + ", ");
		}

	}

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

//			min variable to store minimum value in each iteration of outer for loop
			int min = i;

//			for loop to find minimum value compare to position of j
			for (int j = i + 1; j < arr.length; j++) {

//				ascending order
				if (arr[j] < arr[min]) {

//				descending order
//				if (arr[j] > arr[min]) {

					min = j;
				}

			}

//			now we change the position of current i with the minimum value we just found
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

	}

}

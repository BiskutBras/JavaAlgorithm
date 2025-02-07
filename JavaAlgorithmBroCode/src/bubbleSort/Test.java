package bubbleSort;

public class Test {

	public static void main(String[] args) {
		
		int[] arr = { 4, 6, 5, 9, 0, 7, 1, 2, 8, 3 };
		bubbleSort(arr);
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

	private static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}
	
	

}

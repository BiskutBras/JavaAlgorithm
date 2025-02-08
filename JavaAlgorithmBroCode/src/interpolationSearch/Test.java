package interpolationSearch;

public class Test {

	public static void main(String[] args) {

//		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr = { 20, 41, 62, 83, 104, 125, 146, 167, 188, 209 };
		int target = 209;

		int index = interpolationSearch(target, arr);

		System.out.println(index);

	}

	static int interpolationSearch(int target, int[] arr) {

		int low = 0;
		int high = arr.length - 1;

		while (target >= arr[low] && target <= arr[high] && low <= high) {

			int probe = low +  (((high - low) *target - arr[low]) / (arr[high] - arr[low]));

			if (probe > target) {
				high = probe - 1;
			} else if (probe > target) {
				low = probe - 1;
			} else {
				return probe;
			}
		}

		return -1;
	}

}

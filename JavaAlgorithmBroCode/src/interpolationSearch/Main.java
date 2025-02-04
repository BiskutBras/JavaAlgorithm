package interpolationSearch;

public class Main {

	public static void main(String[] args) {

		// interpolation search
		int[] arr = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 };
		int target = 15;

		int index = interpolation(arr, target);

		if (index != -1) {
			System.out.println("The element " + target + " found at index: " + index);
		} else {
			System.out.println("Element not found!");
		}

	}

	private static int interpolation(int[] arr, int target) {

		int high = arr.length - 1;
		int low = 0;

		while (target >= arr[low] && target <= arr[high] && low <= high) {

			int probe = low + (high - low) * (target - arr[low]) / (arr[high] - arr[low]);

			System.out.println("Probe: " + probe);

			if (arr[probe] > target) {
				high = probe - 1;
			}

			else if (arr[probe] < target) {
				low = probe + 1;
			}

			else {
				return probe;
			}
		}

		return -1;
	}

}

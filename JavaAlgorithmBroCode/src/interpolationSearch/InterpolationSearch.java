package interpolationSearch;

public class InterpolationSearch {

	public int interpolation(int[] arr, int target) {

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

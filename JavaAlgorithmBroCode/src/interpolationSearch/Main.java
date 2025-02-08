package interpolationSearch;

public class Main {

	public static void main(String[] args) {

		InterpolationSearch searcher = new InterpolationSearch();

		// interpolation search
		int[] arr = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 };
		int target = 15;

		int index = searcher.interpolation(arr, target);

		if (index != -1) {
			System.out.println("The element " + target + " found at index: " + index);
		} else {
			System.out.println("Element not found!");
		}

	}

}

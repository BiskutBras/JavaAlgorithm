package recursion;

public class Recursion {

	public static void main(String[] args) {

		// easier to read and debug
		// slower and use more memory

		System.out.println(power(2, 8));
		System.out.println();

		System.out.println(factorial(7));
		System.out.println();

		walkRecursive(10);
		System.out.println();

		walk(5);

	}

	private static int power(int base, int exponent) {

		if (exponent == 0) {
			return 1; // base case
		}
		return base * power(base, exponent - 1);// recursive case
	}

	private static int factorial(int num) {

		if (num == 0) {
			return 1; // base case
		}

		return num * factorial(num - 1); // recursive case

	}

	// iteratively
	private static void walk(int step) {

		for (int j = 0; j < step; j++) {
			System.out.println("You move a step");
		}

	}

//	recursively
	private static void walkRecursive(int step) {

		if (step < 1) {
			return; // base case
		} else
			System.out.println("You take a step");
		walk(step - 1); // recursive case

	}

}

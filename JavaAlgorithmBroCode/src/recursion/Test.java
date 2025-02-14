package recursion;

public class Test {

	public static void main(String[] args) {

		System.out.println(power(2, 0));

		System.out.println();
		System.out.println(factorial(0));

		System.out.println();
		walkRecursive(5);

		System.out.println();
		walk(5);

	}

	private static int power(int base, int exponent) {

		if (exponent < 1) {
			return 1;
		}
		return base * power(base, exponent - 1);
	}

	private static int factorial(int num) {

		if (num < 1) {
			return 1;
		}
		return num * factorial(num - 1);

	}

	// recursively
	private static void walkRecursive(int num) {

		if (num == 0) {
			return; // base case
		}
		System.out.println("You take a step");
		walkRecursive(num - 1); // recursive case
		num--;
	}

//	iteratively
	private static void walk(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("You take a step");
		}
	}
}

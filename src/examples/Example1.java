// Find the maximum negative

package examples;

public class Example1 {

	int getFirstNegativeNum(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				return arr[i];
			}
		}
		return 0;
	}

	void maxNegative(int[] arr) {
		int max = getFirstNegativeNum(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 && max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		int[] input = { 10, -3, -99, -1, -10 };
		example1.maxNegative(input);
	}
}

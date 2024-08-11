/*Assignment - 36 : 30th Jun'2024 [8 mins]

print count of negative and positive numbers from given array.

int[] num = {10,-12,4,56,77};
output : 4 positive numbers and 1 negative number in given array.*/

package array;

public class Numbers_36 {

	void printCountOfNumbers(int[] arr) {
		int positiveNumCount = 0;
		int negativeNumCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positiveNumCount++;
			} else if (arr[i] < 0) {
				negativeNumCount++;
			}
		}

		System.out.println("There are " + positiveNumCount + " positive numbers and " + negativeNumCount
				+ " negative number in the given array");
	}

	public static void main(String[] args) {
		Numbers_36 numbers_36 = new Numbers_36();
		int[] input = { 10, -12, 4, 56, 77 };
		numbers_36.printCountOfNumbers(input);
	}
}

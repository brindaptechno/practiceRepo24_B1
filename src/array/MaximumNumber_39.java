/*Assignment - 39 : 30th Jun'2024 [20 mins]

write a method to return max number from given array.
write an another method to return min number from given array.

input : {11,-33,22,44,56,23}
output : 56 is max number from given array
-33 is the mininum num from given array.*/

package array;

public class MaximumNumber_39 {

	int getMaxNum(int[] arr) {
		int maxNum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}

		System.out.println(maxNum + " is maximum number from given array");
		return maxNum;
	}

	int getMinNum(int[] arr) {
		int minNum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minNum) {
				minNum = arr[i];
			}
		}

		System.out.println(minNum + " is minimum number from given array");
		return minNum;
	}

	public static void main(String[] args) {
		MaximumNumber_39 maximumNumber_39 = new MaximumNumber_39();
		int[] input = { 11, -33, 22, 44, 56, 23 };
		maximumNumber_39.getMaxNum(input);
		maximumNumber_39.getMinNum(input);
	}
}

/*Assignment - 63 : 13th July'2024

return array having maximum numbers from two input array.

input : {10,33,24,55,109}
        {4,55,67,12,100}
        
output : [10, 55, 67, 55, 109]*/

package array;

import java.util.Arrays;

public class MaximumNumber_63 {

	int[] getMaxNumArray(int[] arr1, int[] arr2) {
		int[] maxNumArr = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] >= arr2[i]) {
				maxNumArr[i] = arr1[i];
			} else {
				maxNumArr[i] = arr2[i];
			}
		}
		return maxNumArr;
	}

	public static void main(String[] args) {
		MaximumNumber_63 maximumNumber_63 = new MaximumNumber_63();
		int[] arr1 = { 10, 33, 24, 55, 109 };
		int[] arr2 = { 4, 55, 67, 12, 100 };
		int[] output = maximumNumber_63.getMaxNumArray(arr1, arr2);
		System.out.println(Arrays.toString(output));
	}
}

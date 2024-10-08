/*Assignment - 64 : 13th July'2024

return array having maximum numbers from two input array, if array length is not same, add all extra elements of bigger array at the end..

input : {10,33,24,55,109}
        {4,55,67,12,100,4,23,39}
        
output : [10, 55, 67, 55, 109, 4, 23, 39]*/

package array;

import java.util.Arrays;

public class MaxNum_64 {

	int[] getMaxNumArray(int[] arr1, int[] arr2) {
		int counter = getCount(arr1, arr2);
		int arrLen = 0;
		int[] maxNumArr = new int[counter];
		if (counter == arr1.length) {
			arrLen = arr2.length;
			maxNumArr = arr1;
		} else {
			arrLen = arr1.length;
			maxNumArr = arr2;
		}

		for (int i = 0; i < arrLen; i++) {
			if (arr1[i] >= arr2[i]) {
				maxNumArr[i] = arr1[i];
			} else {
				maxNumArr[i] = arr2[i];
			}
		}
		return maxNumArr;
	}

	int getCount(int[] arr1, int[] arr2) {
		int count = 0;
		int length1 = arr1.length;
		int length2 = arr2.length;
		if (length1 >= length2) {
			count = length1;
		} else {
			count = length2;
		}
		return count;
	}

	public static void main(String[] args) {
		MaxNum_64 maxNum_64 = new MaxNum_64();
		int[] arr1 = { 10, 33, 24, 55, 109 };
		int[] arr2 = { 4, 55, 67, 12, 100, 4, 23, 39 };
		int[] output = maxNum_64.getMaxNumArray(arr1, arr2);
		System.out.println(Arrays.toString(output));

	}
}

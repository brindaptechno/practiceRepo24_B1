/*Assignment - 42 : 2nd July'2024
Return the array of only numbers which is div by 3 and 5.
input : {10,33,30,44,60,2,23,56,0,78}
output : {30,60}
NOTE : to print array you can use System.out.println(Arrays.toString(outputArr));*/

package array;

import java.util.Arrays;

public class DivisibleNumbers_42 {

	int getDivisibleNumCount(int[] input) {
		int counter = 0;
		for (int num = 0; num < input.length; num++) {
			if (input[num] % 3 == 0 && input[num] % 5 == 0 && input[num] != 0) {
				counter++;
			}
		}
		return counter;
	}

	int[] getDivisibleNumArray(int[] arr) {
		int count = getDivisibleNumCount(arr);
		int[] divNumArray = new int[count];
		int arrayCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] % 5 == 0 && arr[i] != 0) {
				divNumArray[arrayCount] = arr[i];
				arrayCount++;
			}
		}
		return divNumArray;
	}

	public static void main(String[] args) {
		DivisibleNumbers_42 divisibleNumbers_42 = new DivisibleNumbers_42();
		int[] arr = { 10, 33, 30, 44, 60, 2, 23, 56, 0, 78 };
		int[] newArr = divisibleNumbers_42.getDivisibleNumArray(arr);
		System.out.println(Arrays.toString(newArr));
	}
}

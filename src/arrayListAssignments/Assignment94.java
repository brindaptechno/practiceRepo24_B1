/*Assignment - 94 : 2nd Aug'2024

Union of 2 arrays having all the numbers present uniquely.

int[] arr1 = {10,13,15,10,15,17,19,17};
int[] arr2 = {55,23,55,10,15,19};

output : [10, 13, 15, 17, 19, 55, 23]*/

package arrayListAssignments;

import java.util.*;

public class Assignment94 {

	ArrayList<Integer> getUnionOfArrays(int[] arr1, int[] arr2) {
		ArrayList<Integer> unionList = new ArrayList<Integer>();

		for (int num1 : arr1) {
			if (!unionList.contains(num1)) {
				unionList.add(num1);
			}
		}

		for (int num2 : arr2) {
			if (!unionList.contains(num2)) {
				unionList.add(num2);
			}
		}
		return unionList;
	}

	public static void main(String[] args) {
		Assignment94 assignment94 = new Assignment94();
		int[] arr1 = { 10, 13, 15, 10, 15, 17, 19, 17 };
		int[] arr2 = { 55, 23, 55, 10, 15, 19 };
		ArrayList<Integer> output = assignment94.getUnionOfArrays(arr1, arr2);
		System.out.println(output);
	}
}

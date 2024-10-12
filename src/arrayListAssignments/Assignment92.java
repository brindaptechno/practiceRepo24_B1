/*Assignment - 92 : 2nd Aug'2024
Return the list of all the elements uniquely.

int[] num = {10,20,93,10,30,40,50,50,20}
output : {10, 20, 93, 30, 40, 50}*/

package arrayListAssignments;

import java.util.*;

public class Assignment92 {

	ArrayList<Integer> getListOfUniqueElements(int[] arr) {
		ArrayList<Integer> uniqueNumList = new ArrayList<Integer>();
		for (int num : arr) {
			if (!uniqueNumList.contains(num)) {
				uniqueNumList.add(num);
			}
		}
		return uniqueNumList;
	}

	public static void main(String[] args) {
		Assignment92 assignment92 = new Assignment92();
		int[] arr = { 10, 20, 93, 10, 30, 40, 50, 50, 20 };
		ArrayList<Integer> output = assignment92.getListOfUniqueElements(arr);
		System.out.println(output);
	}
}

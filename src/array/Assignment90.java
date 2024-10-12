/*Assignment - 90 : 1st Aug'2024
Print the name which is uniquely present using Array.

input : {"techno", "credits", "techno", "india", "pune", "pune"}
output : [credits, india]*/

package array;

import java.util.Arrays;

public class Assignment90 {

	void printUniqueNameFromArray(String[] arr) {
		String[] uniqueNameArr = new String[arr.length];
		int arrCount = 0;
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (str.equals(arr[i])) {
					count++;
				}
			}
			if (count == 1) {
				uniqueNameArr[arrCount] = arr[index];
				arrCount++;
			}
		}
		uniqueNameArr = Arrays.copyOf(uniqueNameArr, arrCount);
		System.out.println(Arrays.toString(uniqueNameArr));
	}

	public static void main(String[] args) {
		Assignment90 assignment90 = new Assignment90();
		String[] arr = { "techno", "credits", "techno", "india", "pune", "pune" };
		assignment90.printUniqueNameFromArray(arr);
	}

}

/*Assignment - 66 : 13th July'2024
return intersecition of 2 array.

input : {10,33,24,55,109}
        {4,109,33,12,100}    
output : {33,109,0,0,0}
    
    int i = arr1.length;    
    for(int index = 0; index < arr2.length; index++){
        output[i] = arr2[index];
        i++;
    }*/

package array;

import java.util.Arrays;

public class Assignment66 {

	int getCount(int[] arr1, int[] arr2) {
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
				}
			}
		}
		return count;
	}

	int[] getIntersectionOfArray(int[] arr1, int[] arr2) {
		int counter = getCount(arr1, arr2);
		int[] newArr = new int[counter];
		int arrCount = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					newArr[arrCount] = arr1[i];
					arrCount++;
				}
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		Assignment66 assignment66 = new Assignment66();

		int[] arr1 = { 10, 33, 24, 55, 109 };
		int[] arr2 = { 4, 109, 33, 12, 100 };
		int[] output = assignment66.getIntersectionOfArray(arr1, arr2);
		System.out.println(Arrays.toString(output));
	}

}

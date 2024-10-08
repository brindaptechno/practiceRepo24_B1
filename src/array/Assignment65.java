/*Assignment - 65 : 13th July'2024
return union of 2 array.

input : {10,33,24,55,109}
        {4,55,67,12,100}    
output : {10, 33, 24, 55, 109, 4, 55, 67, 12, 100}
    
    int i = arr1.length;    
    for(int index = 0; index < arr2.length; index++){
        output[i] = arr2[index];
        i++;
    }*/

package array;

import java.util.Arrays;

public class Assignment65 {

	int[] getUnionOfArray(int[] arr1, int[] arr2) {
		int[] unionArr = new int[arr1.length + arr2.length];
		int arrCount = 0;
		for (int i = 0; i < arr1.length; i++) {
			unionArr[arrCount] = arr1[i];
			arrCount++;
		}

		for (int j = 0; j < arr2.length; j++) {
			unionArr[arrCount] = arr2[j];
			arrCount++;
		}

		return unionArr;
	}

	public static void main(String[] args) {
		Assignment65 assignment65 = new Assignment65();

		int[] arr1 = { 10, 33, 24, 55, 109 };
		int[] arr2 = { 4, 55, 67, 12, 100 };
		int[] output = assignment65.getUnionOfArray(arr1, arr2);
		System.out.println(Arrays.toString(output));
	}

}

/*Assignment - 41

Return the array of only numbers which is negative

input : {-10,33,44,-55,-2,-23,56,0,78}
output : {-10,-55,-2,-23}*/

package array;

import java.util.Arrays;

public class NegativeArray_41 {
	
	int getCountOfNegNum(int[] input) {
		int counter=0;
		for(int i=0; i<input.length; i++) {
			if(input[i] < 0) {
				counter++;
			}
		}
		return counter;
	}

	int[] getnegativeNumArray(int[] arr) {
		int count = getCountOfNegNum(arr);
		int[] negativeArray = new int[count];
		int arrayCount=0;
		
		for (int i=0; i< arr.length; i++) {
			if(arr[i] < 0) {
				negativeArray[arrayCount] = arr[i];
				arrayCount++;
			}
		}
		return negativeArray;
	}
	
	public static void main(String[] args) {
		NegativeArray_41 negativeArray_41 = new NegativeArray_41();
		int[] input = {-10,33,44,-55,-2,-23,56,0,78};
		int[] output = negativeArray_41.getnegativeNumArray(input);
		System.out.println(Arrays.toString(output));
	}
}

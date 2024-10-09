/*Assignment - 76 : 28th July'2024

print all prime number from given array in ascending order.
input : { 10, 13, 55, 44, 17, 11, 18 , 11, 55};
output : 11
         13
         17   */

package primeNumbers;

import java.util.Arrays;

public class Assignment76 {

	boolean isPrimeNum(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	boolean isNumExistMoreThanOnce(int[] arr, int num) {
		boolean flag = false;
		int count =0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == num) {
				flag = true;
				count++;
				if(count>1) {
					arr[index] = 4;
				}
			}
		}
		return flag;
	}

	void printPrimeNumFromArray(int[] arr) {
		int[] newArr = new int[arr.length];
		int arrCount = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean flag = isPrimeNum(arr[index]);
			boolean flag1 = isNumExistMoreThanOnce(arr, arr[index]);
			if (flag1) {
				if (flag) {
					newArr[arrCount] = arr[index];
					arrCount++;
				}
			}
		}
		newArr = Arrays.copyOf(newArr, arrCount);
		Arrays.sort(newArr);
		System.out.println(Arrays.toString(newArr));
	}

	public static void main(String[] args) {
		Assignment76 assignment76 = new Assignment76();
		int[] input = { 10, 13, 55, 44, 17, 11, 18, 11, 55 };
		assignment76.printPrimeNumFromArray(input);
	}
}

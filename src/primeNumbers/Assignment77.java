/*Assignment - 77 : 28th July'2024

print all unique prime number from given array in desc order.
input : { 10, 13, 55, 44, 17, 11, 18 , 11, 55};

output : 
       17
       13
       11*/

package primeNumbers;

import java.util.Arrays;

public class Assignment77 {

	void printUniquePrimeNumbers(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Unique prime numbers are:");
		int[] newArr = new int[arr.length];
		int arrCount = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			boolean flag1 = isNumExist(arr, arr[i]);
			boolean flag = isPrimeNum(arr[i]);
			if (flag1) {
				if (flag) {
					newArr[arrCount] = arr[i];
					arrCount++;
				}
			}
		}
		newArr = Arrays.copyOf(newArr, arrCount);
		System.out.println(Arrays.toString(newArr));
	}

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

	boolean isNumExist(int[] arr, int num) {
		int count = 0;
		boolean flag = false;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == num) {
				count++;
				flag = true;
				if (count > 1) {
					arr[index] = 4;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Assignment77 assignment77 = new Assignment77();
		int[] input = { 10, 13, 55, 44, 17, 11, 18, 11, 55 };
		assignment77.printUniquePrimeNumbers(input);
	}
}

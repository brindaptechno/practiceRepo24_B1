/*Assignment - 72 : 21st July'2024

Find the sum of all the numbers present in the string.

input = "I have 12 years and 3 months of experience";
output : 15*/

package string;

import java.util.Arrays;

public class Assignment72 {

	int getSumOfAllNumbers(String input) {
		String[] arr = input.split(" ");
		int sum = 0;
		//int count = 0;

		for (int i = 0; i < arr.length; i++) {
			try {
				int digit = Integer.parseInt(arr[i]);
				// count++;
				// System.out.println("Number " + count + " is " + digit);
				sum += digit;
			} catch (NumberFormatException ne) {

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment72 assignment72 = new Assignment72();
		int output = assignment72.getSumOfAllNumbers("I have 12 years and 3 months of experience");
		System.out.println("Sum of all numbers from the given input is " + output);
	}
}

/*Assignment - 38 : 30th Jun'2024 [12-15 mins]

write a method which takes one parameter as String array, and return sum of length of the all the elements.

input : {"Maulik", "Technocredits", "Hi"}
output : 21*/

package array;

public class SumOfLength_38 {

	int getSumOfLength(String[] arr) {
		int sumOfLength = 0;

		for (int i = 0; i < arr.length; i++) {
			sumOfLength += arr[i].length();
		}
		System.out.println("Sum of length of all the elements is " + sumOfLength);
		return sumOfLength;
	}

	public static void main(String[] args) {
		SumOfLength_38 sumOfLength_38 = new SumOfLength_38();
		String[] input = { "Maulik", "Technocredits", "Hi" };
		sumOfLength_38.getSumOfLength(input);
	}
}

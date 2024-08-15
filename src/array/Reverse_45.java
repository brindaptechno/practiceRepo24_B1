/*Assignment - 45 : 3rd july'2024 [VIMP]

input : {"techno", "credits", "pune"}
output : {"enup", "stiderc", "onhcet"}

main -> getProcessArr -> getRevString*/

package array;

import java.util.Arrays;

public class Reverse_45 {

	String getReverseString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			output += ch;
		}
		return output;
	}

	String[] getReverseArray(String[] arr) {
		String[] newArr = new String[arr.length];
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			newArr[i] = arr[j];
			newArr[i] = getReverseString(newArr[i]);
		}

		return newArr;
	}

	public static void main(String[] args) {
		Reverse_45 reverse_45 = new Reverse_45();
		String[] input = { "techno", "credits", "pune" };
		String[] output = reverse_45.getReverseArray(input);
		System.out.println(Arrays.toString(output));
	}
}

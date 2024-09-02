/*Assignment - 46 : 3rd july'2024

Return an array having all the vowels in a string.

input : {"techno", "credits", "puneee"}
output : {"eo", "ei", "ueee"}*/

package array;

import java.util.Arrays;

public class Vowels_46 {

	int getVowelCount(String[] input) {
		int counter = 0;
		for (int i = 0; i < input.length; i++) {

			String name = input[i];
			for (int j = 0; j < name.length(); j++) {
				char ch = name.charAt(j);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					counter++;
					break;
				}
			}
		}
		return counter;
	}

	String getVowels(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output += ch;
			}
		}
		return output;
	}

	String[] getVowelsArray(String[] arr) {
		int count = getVowelCount(arr);
		String[] vowelArr = new String[count];
		int arrayCount = 0;

		for (int i = 0; i < arr.length; i++) {
			vowelArr[arrayCount] = getVowels(arr[i]);
			arrayCount++;
		}
		return vowelArr;
	}

	public static void main(String[] args) {
		Vowels_46 vowels_46 = new Vowels_46();
		String[] input = { "techno", "credits", "puneee" };
		String[] output = vowels_46.getVowelsArray(input);
		System.out.println(Arrays.toString(output));
	}
}

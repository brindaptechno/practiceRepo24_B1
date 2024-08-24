/*Assignment - 29 : 15th Jun'2024 [15 mins]

Return a given string by excludings digits.

input : te9ch1noc3re4dits
output : technocredits

hint : output, for, charAt(index), isDigit, if*/

package string;

public class StringWithoutDigits_29 {

	String getStringExclDigits(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				output = output + ch;
			}
		}
		System.out.println(output);
		return output;
	}

	public static void main(String[] args) {
		StringWithoutDigits_29 stringWithoutDigits_29 = new StringWithoutDigits_29();
		stringWithoutDigits_29.getStringExclDigits("te9ch1noc3re4dits");
	}
}

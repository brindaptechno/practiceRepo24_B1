/*Assignment - 82 : 28th July'2024
write a method to find if String is palindrom.

input : 12321
output : 12321 is a palindrom number.

input : 12331
output : 12331 is not a palindrom number.*/

package palindrom;

public class Assignment82 {

	void isStringPalindrom(String input) {
		String orgStr = input;
		StringBuilder sb = new StringBuilder(input);
		String newStr = sb.reverse().toString();

		if (orgStr.equals(newStr)) {
			System.out.println(orgStr + " is a palindrom string");
		} else {
			System.out.println(orgStr + " is not a palindrom string");
		}
	}

	void isStringPalindrom1(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			output += ch;
		}
		if (output.equals(input)) {
			System.out.println(input + " is a palindrom string");
		} else {
			System.out.println(input + " is not a palindrom string");
		}
	}

	public static void main(String[] args) {
		Assignment82 assignment82 = new Assignment82();
		assignment82.isStringPalindrom("madam");
		assignment82.isStringPalindrom("12331");
		assignment82.isStringPalindrom("naman");
		assignment82.isStringPalindrom1("racecar");
		assignment82.isStringPalindrom1("12231");
		assignment82.isStringPalindrom1("12321");
	}
}

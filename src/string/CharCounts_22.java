/*Assignment - 22 : 11th Jun'2024

Print count of uppercase, lowercase, digit and special characters in given input string. [20 mins]

input : "Te4c_hnoCredi3ts"
output : uppercase -> 2
         lowercase -> 11
                 digit -> 2
                 special char -> 1
                 
Hint : use Character class static methods.*/

package string;

public class CharCounts_22 {

	void printCounts(String input) {
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else {
				specialCharCount++;
			}
		}
		System.out.println("Uppercase -> " + upperCaseCount);
		System.out.println("Lowercase -> " + lowerCaseCount);
		System.out.println("Digits -> " + digitCount);
		System.out.println("Special Characters -> " + specialCharCount);
	}

	public static void main(String[] args) {
		CharCounts_22 charCounts_22 = new CharCounts_22();
		charCounts_22.printCounts("Te4c_hnoCredi3ts");
	}
}

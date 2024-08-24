/*Assignment - 28 : 14th Jun'2024
Print the string if no digit found in that string.

input : Tirth
        Anvit
        Mau3lik

output : Tirth doesnt contain any digit
         Anvit doesnt contain any digit*/

package string;

public class NoDigits_28 {

	void printStringWithNoDigits(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(input + " does not contain any digit.");
		}
	}

	public static void main(String[] args) {
		NoDigits_28 noDigits_28 = new NoDigits_28();
		noDigits_28.printStringWithNoDigits("Tirth");
		noDigits_28.printStringWithNoDigits("Anvit");
		noDigits_28.printStringWithNoDigits("Mau3lik");
	}
}

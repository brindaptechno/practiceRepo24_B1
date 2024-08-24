/*Assignment - 31 : 15th Jun'2024 [20 mins]

Return the formatted String where combination should be followed as uppercase + lowercase + digits.

input : "tEChn1oCreDIT7s3"
output : ECCDITthnores173*/

package string;

public class FormattedString_31 {

	String getFormattedString(String input) {
		String upperCase = "", lowerCase = "", digit = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCase += ch;
			} else if (Character.isLowerCase(ch)) {
				lowerCase += ch;
			} else if (Character.isDigit(ch)) {
				digit += ch;
			}
		}
		String output = upperCase + lowerCase + digit;
		System.out.println(output);
		return output;
	}

	public static void main(String[] args) {
		FormattedString_31 formattedString_31 = new FormattedString_31();
		formattedString_31.getFormattedString("tEChn1oCreDIT7s3");
	}
}

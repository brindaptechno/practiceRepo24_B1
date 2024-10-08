package whileLoop;

public class RepetedChar_61 {

	void printRepeatedChar(String input) {

		while (input.length() > 0) {
			char ch = input.charAt(0);
			int orgLength = input.length();
			input = input.replace(String.valueOf(ch), "");
			int newLength = input.length();

			int freq = orgLength - newLength;
			if (freq > 1) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		RepetedChar_61 repetedChar_61 = new RepetedChar_61();
		repetedChar_61.printRepeatedChar("aakanksha");
	}
}

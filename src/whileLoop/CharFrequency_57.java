/*Assignment - 57 : 5th July'2024 [IMP]
 Print frequency of each character in a given string.
 
 input : aakanksha
 output : a -> 4
          k -> 2
          n -> 1
          s -> 1
          h -> 1
 
 Note : Use while loop*/

package whileLoop;

public class CharFrequency_57 {

	void printCharFrequency(String input) {

		while (input.length() > 0) {
			char ch = input.charAt(0);

			int orgLength = input.length();
			input = input.replace(String.valueOf(ch), "");
			int newLength = input.length();

			int frequency = orgLength - newLength;
			System.out.println(ch + " -> " + frequency);
		}
	}

	public static void main(String[] args) {
		CharFrequency_57 charFrequency_57 = new CharFrequency_57();
		charFrequency_57.printCharFrequency("aakanksha");
	}
}

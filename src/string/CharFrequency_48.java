/*Assignment - 48 : 5th July'2024
Print frequency of each character in a given string.

input : aakanksha
output : a -> 4
a -> 4
k -> 2
a -> 4
n -> 1
k -> 2
s -> 1
h -> 1
a -> 4*/

package string;

public class CharFrequency_48 {

	void printFrequencyOfChar(String input) {

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int frequency = 0;
			for (int j = 0; j < input.length(); j++) {
				if (ch == input.charAt(j)) {
					frequency++;
				}
			}
			System.out.println(ch + " -> " + frequency);
		}
	}

	public static void main(String[] args) {
		CharFrequency_48 charFrequency_48 = new CharFrequency_48();
		charFrequency_48.printFrequencyOfChar("aakanksha");
	}
}

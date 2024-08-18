/*Assignment - 50 : 5th July'2024 [IMP]
 Print frequency of each character in a given string.
 
 input : aakanksha
 output : a -> 4
          k -> 2
          n -> 1
          s -> 1
          h -> 1*/

package string;

public class CharFrequency_50 {

	void printCharFreq(String input) {

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int frequency = 0;
			if (i == input.indexOf(ch)) {
				for (int j = 0; j < input.length(); j++) {
					if (ch == input.charAt(j)) {
						frequency++;
					}
				}
				System.out.println(ch + " -> " + frequency);
			}
		}
	}

	public static void main(String[] args) {
		CharFrequency_50 charFrequency_50 = new CharFrequency_50();
		charFrequency_50.printCharFreq("aakanksha");
	}
}

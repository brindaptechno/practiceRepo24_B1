/*Assignment - 51 : 5th July'2024 [IMP]
 Print frequency of each vowel character in a given string.
 
 input : technocredits
 output : e -> 2
          o -> 1
          i -> 1*/

package string;

public class VowelFrequency_51 {

	void printVowelFrequency(String input) {
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int frequency = 0;
			if (i == input.indexOf(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					for (int j = 0; j < input.length(); j++) {
						if (ch == input.charAt(j))
							frequency++;
					}
					System.out.println(ch + " -> " + frequency);
				}
			}
		}
	}

	public static void main(String[] args) {
		VowelFrequency_51 vowelFrequency_51 = new VowelFrequency_51();
		vowelFrequency_51.printVowelFrequency("technocredits");
	}
}

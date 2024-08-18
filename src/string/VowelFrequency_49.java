/*Assignment - 49 : 5th July'2024
Print frequency of each vowel character in a given string.

input : technocredits
output : e -> 2
o -> 1
e -> 2
i -> 1*/

package string;

public class VowelFrequency_49 {

	void printVowelCharFreq(String input) {
		for(int i=0; i<input.length(); i++) {
			char ch =input.charAt(i);
			int frequency =0;
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				for(int j=0; j<input.length();j++) {
					if(ch == input.charAt(j)) {
						frequency++;
					}
				}
				System.out.println(ch  + " -> " + frequency);
			}
			
		}
	}
	
	public static void main(String[] args) {
		VowelFrequency_49 vowelFrequency_49 = new VowelFrequency_49();
		vowelFrequency_49.printVowelCharFreq("technocredits");
	}
}

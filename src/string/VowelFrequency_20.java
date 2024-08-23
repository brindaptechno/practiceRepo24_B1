/*Assignment - 20 : 10th Jun'2024 [15 mins]

Print the freqency of vowel characters from given input.

input : "sheetal kadam"
output : 5

input : "aakansha dharmadhikari"
output : 9*/

package string;

public class VowelFrequency_20 {

	void vowelFrequencyOfChar(String input) {
		int frequency=0;
		for(int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
				frequency++;
			}
		}
		System.out.println(input + " -> " + frequency);
	}
	
	public static void main(String[] args) {
		VowelFrequency_20 vowelFrequency_20 = new VowelFrequency_20();
		vowelFrequency_20.vowelFrequencyOfChar("sheetal kadam");
		vowelFrequency_20.vowelFrequencyOfChar("aakansha dharmadhikari");
	}
}

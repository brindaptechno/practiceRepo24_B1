/*Assignment - 21 : 10th Jun'2024 [20 mins]

Print the frequency of each vowel character from given input.

input : "aakansha dharmadhikari"
output : Freq of char a is 7
         Freq of char e is 0
         Freq of char i is 2
         Freq of char o is 0
         Freq of char u is 0*/

package string;

public class VowelFrequency_21 {

	void printVowelFreq(String input) {
		int aFreq = 0, eFreq = 0, iFreq = 0, oFreq = 0, uFreq = 0;
		
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a') {
				aFreq++;
			} else if (ch == 'e') {
				eFreq++;
			} else if (ch == 'i') {
				iFreq++;
			} else if (ch == 'o') {
				oFreq++;
			} else if (ch == 'u') {
				uFreq++;
			}
		}
		System.out.println("Frequency of character a is " + aFreq);
		System.out.println("Frequency of character e is " + eFreq);
		System.out.println("Frequency of character i is " + iFreq);
		System.out.println("Frequency of character o is " + oFreq);
		System.out.println("Frequency of character u is " + uFreq);
	}

	public static void main(String[] args) {
		VowelFrequency_21 vowelFrequency_21 = new VowelFrequency_21();
		vowelFrequency_21.printVowelFreq("aakansha dharmadhikari");
	}
}

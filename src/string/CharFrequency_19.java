/*Assignment - 19 : 10th Jun'2024 [12-15 mins]

Print the freqency of given character from given input.
input : "sheetal kadam" , 'a'
output : 3
 
input : "pune india techno credits", ' '
output : 3
 
 void printFreq(String input, char ch){
 
 }
sop("freq of " + ch + " is " + count);*/

package string;

public class CharFrequency_19 {

	void printFreqOfChar(String input, char ca) {
		int frequency = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == ca) {
				frequency++;
			}
		}
		System.out.println(input + ", '" + ca + "' -> " + frequency);
	}

	public static void main(String[] args) {
		CharFrequency_19 charFrequency_19 = new CharFrequency_19();
		charFrequency_19.printFreqOfChar("sheetal kadam", 'a');
		charFrequency_19.printFreqOfChar("pune india techno credits", ' ');
	}
}

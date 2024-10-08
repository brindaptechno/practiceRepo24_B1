/*Assignment - 62 : 11th July'2024

Find the vowel having max frequency.

input : Deharmadhikari : a -> 3
Entertainment : e -> 3
Persistent : e -> 2*/

package string;

public class Assignment62 {

	String getMaxFrequency(String input) {
		int maxFreq = 0;
		char maxChar = ' ';
		
		input = input.toLowerCase();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (index == input.indexOf(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					int count = getCharFreq(input, ch);
					if (maxFreq < count) {
						maxFreq = count;
						maxChar = ch;
					}
				}
			}
		}
		return maxChar + " -- " + maxFreq;
	}

	int getCharFreq(String input, char cha) {
		int freq = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == cha) {
				freq++;
			}
		}
		return freq;
	}

	public static void main(String[] args) {
		Assignment62 assignment62 = new Assignment62();
		String output1 = assignment62.getMaxFrequency("Deharmadhikari");
		System.out.println(output1);
		String output2 = assignment62.getMaxFrequency("Entertainment");
		System.out.println(output2);
		String output3 = assignment62.getMaxFrequency("Persistent");
		System.out.println(output3);
	}
}

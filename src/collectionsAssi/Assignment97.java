/*Assignment - 97 : 4th Aug
Find the freq of each character in given word.

input : "technocredits";
output : {c=2, d=1, e=2, h=1, i=1, n=1, o=1, r=1, s=1, t=2}*/

package collectionsAssi;

import java.util.*;

public class Assignment97 {

	void printFrequencyOfEachChar(String input) {
		char[] chArr = input.toCharArray();
		Map<Character, Integer> charFreqMap = new TreeMap<Character, Integer>();
		for (char ch : chArr) {
			if (charFreqMap.containsKey(ch)) {
				int count = charFreqMap.get(ch);
				charFreqMap.put(ch, count + 1);
			} else {
				charFreqMap.put(ch, 1);
			}
		}
		System.out.println(charFreqMap);
	}

	public static void main(String[] args) {
		Assignment97 assignment97 = new Assignment97();
		assignment97.printFrequencyOfEachChar("technocredits");
	}
}

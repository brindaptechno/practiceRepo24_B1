/*Assignment - 98 : 4th Aug
Find the freq of each word from given String.
String input = "Hi Hi Hello India Pune Pune Pune";
output : {Hello=1, Hi=2, India=1, Pune=3}*/

package collectionsAssi;

import java.util.*;

public class Assignment98 {

	void printFrequencyOfEachWord(String input) {
		String[] wordArr = input.split(" ");
		Map<String, Integer> wordFreqMap = new TreeMap<String, Integer>();
		for (String word : wordArr) {
			if (wordFreqMap.containsKey(word)) {
				int count = wordFreqMap.get(word);
				wordFreqMap.put(word, count + 1);
			} else {
				wordFreqMap.put(word, 1);
			}
		}
		System.out.println(wordFreqMap);
	}

	public static void main(String[] args) {
		Assignment98 assignment98 = new Assignment98();
		assignment98.printFrequencyOfEachWord("Hi Hi Hello India Pune Pune Pune");
	}
}

/*Assignment - 99 : 4th Aug
Find the freq of each num from given array.
int[] arr = {10,10,20,30,30,30,30,40,40,50};
output : {10=2,20=1,30=4,40=2,50=1}*/

package arrayListAssignments;

import java.util.*;

public class Assignment99 {

	void printFreqOfEachNum(int[] arr) {
		Map<Integer, Integer> numFreqMap = new TreeMap<Integer, Integer>();
		for (int num : arr) {
			if (numFreqMap.containsKey(num)) {
				int count = numFreqMap.get(num);
				numFreqMap.put(num, count + 1);
			} else {
				numFreqMap.put(num, 1);
			}
		}
		System.out.println(numFreqMap);
	}

	public static void main(String[] args) {
		Assignment99 assignment99 = new Assignment99();
		int[] input = { 10, 10, 20, 30, 30, 30, 30, 40, 40, 50 };
		assignment99.printFreqOfEachNum(input);
	}
}

/*Assignment - 96 : 3nd Aug'2024

Replace all "Maulik" except first occurance with "Techno" from given Array.

input : {"Maulik", "Techno", "Maulik","Hi", "Hello", "Maulik", "Pune"}
output : {"Maulik", "Techno", "Techno","Hi", "Hello", "Techno", "Pune" }*/

package arrayListAssignments;

import java.util.*;

public class Assignment96 {

	ArrayList<String> getReplacedData(String[] arr, String name) {
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList(arr));
		while (newList.indexOf(name) != newList.lastIndexOf(name)) {
			int index = newList.lastIndexOf(name);
			newList.set(index, "Techno");
		}
		return newList;
	}

	public static void main(String[] args) {
		Assignment96 assignment96 = new Assignment96();
		String[] input = { "Maulik", "Techno", "Maulik", "Hi", "Hello", "Maulik", "Pune" };
		ArrayList<String> output = assignment96.getReplacedData(input, "Maulik");
		System.out.println(output);
	}
}

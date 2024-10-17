/*Assignment - 95 : 3nd Aug'2024

Replace all "Maulik" with "Techno" from given Array.

input : {"Maulik", "Techno", "Credits","Hi", "Hello", "Maulik", "Pune"}
output : {"Techno", "Techno", "Credits","Hi", "Hello", "Techno", "Pune" }*/

package arrayListAssignments;

import java.util.*;

public class Assignment95 {

	ArrayList<String> getReplacedData(String[] arr, String name) {
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList(arr));

		while (newList.contains(name)) {
			int index = newList.indexOf(name);
			newList.set(index, "Techno");
		}
		return newList;
	}

	public static void main(String[] args) {
		Assignment95 assignment95 = new Assignment95();
		String[] input = { "Maulik", "Techno", "Credits", "Hi", "Hello", "Maulik", "Pune" };
		ArrayList<String> output = assignment95.getReplacedData(input, "Maulik");
		System.out.println(output);
	}
}

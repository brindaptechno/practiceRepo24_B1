/*Assignment - 91 : 1st Aug'2024
Print the name which is uniquely present using ArrayList.

input : {"techno", "credits", "techno", "india", "pune", "pune"}
output : [credits, india]*/

package arrayListAssignments;

import java.util.*;

public class Assignment91 {

	ArrayList<String> getUniqueNamePresent(String[] arr) {
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> uniqueNameList = new ArrayList<String>();
		for (int index = 0; index < nameList.size(); index++) {
			String name = nameList.get(index);
			if (nameList.indexOf(name) == nameList.lastIndexOf(name)) {
				uniqueNameList.add(name);
			}
		}
		return uniqueNameList;
	}

	public static void main(String[] args) {
		Assignment91 assignment91 = new Assignment91();
		String[] input = { "techno", "credits", "techno", "india", "pune", "pune" };
		ArrayList<String> output = assignment91.getUniqueNamePresent(input);
		System.out.println(output);
	}
}

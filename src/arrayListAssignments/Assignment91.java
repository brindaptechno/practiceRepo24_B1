/*Assignment - 91 : 1st Aug'2024
Print the name which is uniquely present using ArrayList.

input : {"techno", "credits", "techno", "india", "pune", "pune"}
output : [credits, india]*/


package arrayListAssignments;

import java.util.*;

public class Assignment91 {

	void printUniqueNameFromArrayList(ArrayList<String> al) {
		ArrayList<String> uniqueNameList = new ArrayList<String>();
		
		for(int index=0; index<al.size();index++) {
			String str = al.get(index);
			if(al.indexOf(str) == al.lastIndexOf(str)) {
				uniqueNameList.add(str);
			}
		}
		System.out.println(uniqueNameList);
	}
	
	public static void main(String[] args) {
		Assignment91 assignment91 = new Assignment91();
		
		String arr[] = {"techno", "credits", "techno", "india", "pune", "pune"};
		List<String> tempList = Arrays.asList(arr);
		
		ArrayList<String> al = new ArrayList<String>(tempList);
		assignment91.printUniqueNameFromArrayList(al);
	}
}

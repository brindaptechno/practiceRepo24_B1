/*Assignment - 93 : 2nd Aug'2024
Remove all duplicate given name from given Array, if that name is not present, print the appropiate message.

input : {"Priya", "Umesh", "Krutika","Prabhakar" ,"Disha", "Umesh", "Saurabh", "Umesh", "Vishakha"}, "Umesh"
output : ["Priya", "Umesh", "Krutika","Prabhakar", "Disha", "Saurabh", "Vishakha"]

input : {"Priya", "Umesh", "Krutika","Prabhakar" ,"Disha", "Umesh", "Saurabh", "Umesh", "Vishakha"}, "Akshay"
output : Akshay is not present at all.*/

package arrayListAssignments;

import java.util.*;

public class Assignment93 {

	ArrayList<String> getDuplicatesRemoved(String[] arr, String name) {
		List<String> tempList = Arrays.asList(arr);
		ArrayList<String> newList = new ArrayList<String>(tempList);
		int index = 0;
		if (newList.contains(name)) {
			while (newList.indexOf(name) != newList.lastIndexOf(name)) {
				index = newList.lastIndexOf(name);
				newList.remove(index);
			}
		} else {
			System.out.println(name + " is not present at all");
		}
		return newList;
	}

	public static void main(String[] args) {
		Assignment93 assignment93 = new Assignment93();

		String[] arr1 = { "Priya", "Umesh", "Krutika", "Prabhakar", "Disha", "Umesh", "Saurabh", "Umesh", "Vishakha" };
		ArrayList<String> output1 = assignment93.getDuplicatesRemoved(arr1, "Umesh");
		System.out.println(output1);

		String[] arr2 = { "Priya", "Umesh", "Krutika", "Prabhakar", "Disha", "Umesh", "Saurabh", "Umesh", "Vishakha" };
		ArrayList<String> output2 = assignment93.getDuplicatesRemoved(arr2, "Akshay");
		System.out.println(output2);
	}
}

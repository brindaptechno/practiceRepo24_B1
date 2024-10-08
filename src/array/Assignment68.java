/*Assignment - 68 : 15th July'2024

return uniquely present characters from given string array.

input : {aakanksha, techno, rutuja }
output : {nsh, techno, rtja}*/

package array;

import java.util.Arrays;

public class Assignment68 {
	
	String[] getUniqueCharArray(String[] arr) {
		String[] newArr = new String[arr.length];
		int arrCount=0;
		
		for(int index=0; index<arr.length;index++) {
			String name = arr[index];
			String output="";
			for(int i=0; i<name.length();i++) {
				char ch = name.charAt(i);
				if(name.indexOf(ch) == name.lastIndexOf(ch)) {
					output += ch;
				}
			}
			newArr[arrCount] = output;
			arrCount++;
		}
		return newArr;
	}
	
	public static void main(String[] args) {
		Assignment68 assignment68 = new Assignment68();
		String[] input = {"aakanksha", "techno", "rutuja" };
		String[] output = assignment68.getUniqueCharArray(input);
		System.out.println(Arrays.toString(output));
	}
}

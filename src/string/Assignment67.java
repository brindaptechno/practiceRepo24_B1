/*Assignment - 67 : 15th July'2024 [IMP]

return uniquely present characters from given string.

input : aakanksha
output : nsh*/

package string;

public class Assignment67 {

	String getUniqueChar(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				output += ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment67 assignment67 = new Assignment67();
		String output = assignment67.getUniqueChar("aakanksha");
		System.out.println(output);
	}

}

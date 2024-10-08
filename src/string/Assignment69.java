/*Assignment - 69 : 15th July'2024

return uniquely present letters followed by digit(s) from given string.

input : aakan1ksh44a
output : nh*/

package string;

public class Assignment69 {

	String getRequiredData(String input) {
		String output ="";
		for(int index=0; index<input.length();index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				char ch1 = input.charAt(index+1);
				if(Character.isDigit(ch1)) {
					output+= ch;
				}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment69 assignment69 = new Assignment69();
		String output = assignment69.getRequiredData("aakan1ksh44a");
		System.out.println(output);
	}
	
}

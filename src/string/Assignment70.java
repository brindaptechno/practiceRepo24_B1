/*Assignment - 70 : 15th July'2024
return uniquely present first volwel letter followed by digit(s) from given string.

input : aakan1ksi44au3p
output : i*/

package string;

public class Assignment70 {

	char getFirstVowelFollowedByDigit(String input) {
		char cha = ' ';
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch =='a'||ch=='e'||ch =='i'||ch=='o'||ch=='u') {
				char ch1 = input.charAt(index + 1);
				if(Character.isDigit(ch1)) {
					cha = ch;
					break;
				}
			}
		}
		return cha;
	}
	
	public static void main(String[] args) {
		Assignment70 assignment70 = new Assignment70();
		char output = assignment70.getFirstVowelFollowedByDigit("aakan1ksi44au3p");
		System.out.println("First vowel letter followed by digit is " + output);
	}
}

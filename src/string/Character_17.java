/*Assignment - 17 : 10th Jun'2024 [8-10 mins]
print each character in new line from given input.

input : techno
output : t
         e
         c
         h
         n
         o       */

package string;

public class Character_17 {

	void printCharacter(String input) {
		for(int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		Character_17 character_17 = new Character_17();
		character_17.printCharacter("techno");
	}
}

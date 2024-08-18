/*Assignment - 52 : 5th July'2024 [IMP]
Print all characters uniquely from given string.
 
 input : aakanksha
 output : aknsh*/

package string;

public class UniqueChar_52 {

	void printUniqueChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (i == input.indexOf(ch)) {
				System.out.print(ch);	
			}
		}
	}

	public static void main(String[] args) {
		UniqueChar_52 uniqueChar_52 = new UniqueChar_52();
		uniqueChar_52.printUniqueChar("aakanksha");
	}
}

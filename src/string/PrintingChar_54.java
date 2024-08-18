/*Assignment - 54 : 5th July'2024 [IMP]
Print repeatative characters from given String.
 
input : aakanksha
output : ak*/

package string;

public class PrintingChar_54 {

	void printRepeatedChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = 0;
			if (i == input.indexOf(ch)) {
				for (int j = 0; j < input.length(); j++) {
					if (ch == input.charAt(j))
						count++;
				}
				if (count > 1)
					System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		PrintingChar_54 printingChar_54 = new PrintingChar_54();
		printingChar_54.printRepeatedChar("aakanksha");
	}
}

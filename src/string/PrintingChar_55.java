/*Assignment - 55 : 5th July'2024 [IMP]
Print repeatative characters from given String in reverse order.
 
input : aakanksh
output : ka*/

package string;

public class PrintingChar_55 {

	void printReverseRepeatedChar(String input) {
		for(int i =input.length()-1; i>=0; i--) {
			char ch = input.charAt(i);
			int freq=0;
			if(i == input.indexOf(ch)) {
				for(int j=0; j<input.length();j++) {
					if(ch == input.charAt(j)) {
						freq++;
					}
				}
				if(freq >1) {
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		PrintingChar_55 printingChar_55 = new PrintingChar_55();
		printingChar_55.printReverseRepeatedChar("aakanksh");
	}
}

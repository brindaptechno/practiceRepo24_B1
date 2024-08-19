/*Assignment - 58 : 5th July'2024 [IMP]
 Print frequency of each vowel character in a given string.
 
 input : technocredits
 output : e -> 2
          o -> 1
          i -> 1     
 Note : Use while loop*/

package whileLoop;

public class VowelFrequency_58 {

	void printVowelFrequency(String input) {
		
		while(input.length() > 0 ) {
			char ch = input.charAt(0);
			
			int length = input.length();
			input = input.replace(String.valueOf(ch), "");
			int newLength = input.length();
			
			int frequency = length - newLength;
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " -> " + frequency);
			}
		}
	}
	
	public static void main(String[] args) {
		VowelFrequency_58 vowelFrequency_58 = new VowelFrequency_58();
		vowelFrequency_58.printVowelFrequency("technocredits");
	}
}

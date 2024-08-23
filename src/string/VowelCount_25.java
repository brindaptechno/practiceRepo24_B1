/*Assignment - 25 : 14th Jun'2024

Print vowel count in each string, print total vowel count get from all 3 strings.

input : technocredits
        aakanksha
        pune        

output : technocredits -> 4
         aakanksha -> 4
         pune -> 2
        total vowel count : 10 */

package string;

public class VowelCount_25 {

	int printVowelCount(String input) {
		int vowelCount=0;
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		System.out.println(input + " -> " + vowelCount );
		return vowelCount;
	}
	
	public static void main(String[] args) {
		VowelCount_25 vowelCount_25 = new VowelCount_25();
		int ans1 = vowelCount_25.printVowelCount("technocredits");
		int ans2 = vowelCount_25.printVowelCount("aakanksha");
		int ans3 = vowelCount_25.printVowelCount("pune");
		System.out.println("Total Vowel Count: " + (ans1 + ans2 + ans3));
	}
}

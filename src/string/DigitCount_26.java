/*Assignment - 26 : 14th Jun'2024

Print digit count in each string, print total digit count get from all 3 strings.

input : d1ish3a4
        a1nkur
        te1ja3s        

output : d1ish3a4 -> 3
         a1nkur -> 1
         te1ja3s -> 2                 
                 total digits : 6*/

package string;

public class DigitCount_26 {

	int getDigitCount(String input) {
		int digitCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				digitCount++;
			}
		}
		System.out.println(input + " -> " + digitCount);
		return digitCount;
	}

	public static void main(String[] args) {
		DigitCount_26 digitCount_26 = new DigitCount_26();
		int ans1 = digitCount_26.getDigitCount("d1ish3a4");
		int ans2 = digitCount_26.getDigitCount("a1nkur");
		int ans3 = digitCount_26.getDigitCount("te1ja3s");
		System.out.println("Total digits: " + (ans1 + ans2 + ans3));
	}
}

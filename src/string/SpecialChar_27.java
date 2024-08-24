/*Assignment - 27 : 14th Jun'2024

Print special character count in each string, print total special character count get from all 3 strings.

input : d1i_sh3a4
        a1n_ku!r
        te,1j_a_3_s        

output : d1i_sh3a4 -> 1
         a1n_ku!r -> 2
         te,1j_a_3_s -> 4                 
total special character count : 7*/

package string;

public class SpecialChar_27 {

	int getSpecialCharCount(String input) {
		int speialCharCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
				speialCharCount++;
			}
		}
		System.out.println(input + " -> " + speialCharCount);
		return speialCharCount;
	}

	public static void main(String[] args) {
		SpecialChar_27 specialChar_27 = new SpecialChar_27();
		int ans1 = specialChar_27.getSpecialCharCount("d1i_sh3a4");
		int ans2 = specialChar_27.getSpecialCharCount("a1n_ku!r");
		int ans3 = specialChar_27.getSpecialCharCount("te,1j_a_3_s");
		System.out.println("Total special character count: " + (ans1 + ans2 + ans3));
	}
}

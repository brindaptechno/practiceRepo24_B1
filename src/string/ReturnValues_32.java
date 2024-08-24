/*Assignment - 32 : 15th Jun'2024

Return "techno" if given Stirng contains more digits,
if uppercases are more return "credits",
return "pune" if lowercases are more,
return "india" if its a balance string.

input : Sh1iv2aYogi2323232145
output : techno

input : MAUliK12
output : credits

input : M1AU2li3k
output : india

input : technocreDits
output : pune*/

package string;

public class ReturnValues_32 {

	String getOutput(String input) {
		int digitCount=0, uCaseCount=0, lCaseCount=0;
		for(int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				digitCount++;
			}else if (Character.isUpperCase(ch)) {
				uCaseCount++;
			}else if (Character.isLowerCase(ch)) {
				lCaseCount++;
			}
		}
		if(digitCount > uCaseCount && digitCount >lCaseCount ) {
			return "techno";
		}else if (uCaseCount > digitCount && uCaseCount >lCaseCount) {
			return "credits";
		}else if (lCaseCount > digitCount && lCaseCount >uCaseCount) {
			return "pune";
		}else if(digitCount == uCaseCount &&  digitCount == lCaseCount && uCaseCount == lCaseCount) {
			return "india";
		}
		return input;
	}
	
	public static void main(String[] args) {
		ReturnValues_32 returnValues_32 = new ReturnValues_32();
		System.out.println(returnValues_32.getOutput("Sh1iv2aYogi2323232145"));
		System.out.println(returnValues_32.getOutput("MAUliK12"));
		System.out.println(returnValues_32.getOutput("M1AU2li3k"));
		System.out.println(returnValues_32.getOutput("technocreDits"));
	}
}

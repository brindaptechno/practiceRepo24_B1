/*Assignment - 30 : 15th Jun'2024 [25 mins]

Return a reverse string by excludings digits.

input : 1tec2hn3o
output : onhcet


String getRevereString(String str){

}

String getStringExcludingDigits(String str){

}

String getProcessInput(String input){
input = getRevereString(input);
sop(input);
input = getStringExcludingDigits(input);
return input;
}

public static void main(String[] args){
Test test = new Test();
String input = "t1e3chn9o";
String output = test.getProcessInput(input);
System.out.println(input + ":" + output);*/

package string;

public class ReverseString_30 {

	String getRevereString(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			output = output + ch;
		}
		return output;
	}

	String getStringExcludingDigits(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				answer = answer + ch;
			}
		}
		return answer;
	}

	String getProcessInput(String input) {
		input = getRevereString(input);
		input = getStringExcludingDigits(input);
		return input;
	}

	public static void main(String[] args) {
		ReverseString_30 reverseString_30 = new ReverseString_30();
		String input = reverseString_30.getProcessInput("1tec2hn3o");
		System.out.println(input);
	}
}

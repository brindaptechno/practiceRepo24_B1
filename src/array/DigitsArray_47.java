/*Assignment - 47 : 3rd july'2024

Return an int array having all the digits from String array.
input : {"te1ch3no", "cr5edit7s7", "6pun6eee2"}
output : {13,577,662}

int[] extractDigits(String[] arr){
}*/

package array;

import java.util.Arrays;

public class DigitsArray_47 {

	String getDigits(String input) {
		String output = "";
		for(int i=0; i<input.length(); i++) {
			char ch =input.charAt(i);
			if(Character.isDigit(ch)) {
				output +=ch;
			}
		}
		return output;
	}
	
	int[] getDigitArray(String[] arr) {
		int[] digitArr = new int[arr.length];
		int arrayCount=0;
		for(int i=0; i<arr.length;i++) {
			String input = getDigits(arr[i]);
			int digits = Integer.parseInt(input);
			digitArr[arrayCount] = digits;
			arrayCount++;
		}
		return digitArr;
	}
	
	public static void main(String[] args) {
		DigitsArray_47 digitsArray_47 = new DigitsArray_47();
		String[] input = {"te1ch3no", "cr5edit7s7", "6pun6eee2"};
		int[] output = digitsArray_47.getDigitArray(input);
		System.out.println(Arrays.toString(output));
	}
}

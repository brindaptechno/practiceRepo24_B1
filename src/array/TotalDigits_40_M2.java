/*Assignment - 40 : 30th Jun'2024 [40 mins]
find total number of digits in array.

input : {"tec1hn3o","cr1e1d1i1t1s","india","pune1","A22nvit","tirth"}
output : 10*/

package array;

public class TotalDigits_40_M2 {

	int getCountOfDigits(String input) {
		int countOfDigits = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				countOfDigits++;
			}
		}
		return countOfDigits;
	}

	int getTotalDigits(String[] arr) {
		int totalDigits = 0;

		for (int j = 0; j < arr.length; j++) {
			totalDigits += getCountOfDigits(arr[j]);
		}

		System.out.println("Total number of digits in the given array is " + totalDigits);
		return totalDigits;
	}

	public static void main(String[] args) {
		TotalDigits_40_M2 totalDigits_40_M2 = new TotalDigits_40_M2();
		String[] input = { "tec1hn3o", "cr1e1d1i1t1s", "india", "pune1", "A22nvit", "tirth" };
		totalDigits_40_M2.getTotalDigits(input);
	}
}

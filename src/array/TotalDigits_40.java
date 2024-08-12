/*Assignment - 40 : 30th Jun'2024 [40 mins]
find total number of digits in array.

input : {"tec1hn3o","cr1e1d1i1t1s","india","pune1","A22nvit","tirth"}
output : 10*/

package array;

public class TotalDigits_40 {

	int totalDigits(String[] str) {
		int totalDigits = 0;

		for (int i = 0; i < str.length; i++) {
			String name = str[i];

			for (int j = 0; j < name.length(); j++) {
				char ch = name.charAt(j);

				if (Character.isDigit(ch)) {
					totalDigits++;
				}
			}
		}
		
		System.out.println("Total number of digits in the given array is " + totalDigits);
		return totalDigits;
	}

	public static void main(String[] args) {
		TotalDigits_40 totalDigits_40 = new TotalDigits_40();
		String[] input = { "tec1hn3o", "cr1e1d1i1t1s", "india", "pune1", "A22nvit", "tirth" };
		totalDigits_40.totalDigits(input);
	}
}

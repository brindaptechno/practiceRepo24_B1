/*Assignment - 34 : 29th Jun'2024
From the given string find sum of all the digits present.

input : t1ech2no
output : 3

input : credits
output : no digit present in the string

input : 1234
output : 10*/

package string;

public class Sum_34 {

	void sum(String input) {
		int sum = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				sum = Character.getNumericValue(ch) + sum;
			}
		}

		if (sum == 0) {
			System.out.println(input + " -> No digit is present in the string");
		} else {
			System.out.println(input + " -> Sum = " + sum);
		}
	}

	public static void main(String[] args) {
		Sum_34 sum_34 = new Sum_34();
		sum_34.sum("t1ech2no");
		sum_34.sum("credits");
		sum_34.sum("1234");
	}
}

/*Assignment - 13 : 2nd Jun'2024 [12- 15 mins]
On user defined range print last number which is divisible by 5 & 9.

Hint : pass start and end index as a parameter and use break statement.

Input : Range -> 5 to 100
Output : Last number divisible by 5 & 9 is 90*/

package basic.numbers;

public class DivisibleNum_13 {

	void printLastDivNum(int startRange, int endRange) {
		for (int num = endRange; num >= startRange; num--) {
			if (num % 5 == 0 && num % 9 == 0) {
				System.out.println("Last number divisible by 5 & 9 is " + num);
				break;
			}
		}
	}

	public static void main(String[] args) {
		DivisibleNum_13 divisibleNum_13 = new DivisibleNum_13();
		divisibleNum_13.printLastDivNum(5, 100);
	}
}

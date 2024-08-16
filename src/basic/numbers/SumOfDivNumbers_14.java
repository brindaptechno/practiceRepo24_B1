/*Assignment - 14 : 21st Jan'2024 [10 - 15 mins]
On user defined range print sum of all the number which is divisible by 5 & 10.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 50 
Output : In the range 10 to 50, calculated sum is 150*/

package basic.numbers;

public class SumOfDivNumbers_14 {

	void sumOfDivisibleNum(int startRange, int endRange) {
		int sum = 0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 10 == 0) {
				sum += num;
			}
		}
		System.out.println("In the range of " + startRange + " to " + endRange + " calculated sum is " + sum);
	}

	public static void main(String[] args) {
		SumOfDivNumbers_14 sumOfDivNumbers_14 = new SumOfDivNumbers_14();
		sumOfDivNumbers_14.sumOfDivisibleNum(10, 50);
	}

}

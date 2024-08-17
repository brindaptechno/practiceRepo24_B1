/*Assignment - 16 : 21st Jan'2024 [20 to 30 mins]
On user defined range print sum and average of numbers which is divisible by 5 & 7.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 110
Output : Numbers are,
35
70
105
Found 3 numbers which are divible by 5 & 7.
sum = 210
Average = 70*/

package basic.numbers;

public class SumAndAvg_16 {

	void printSumAndAvg(int startRange, int endRange) {
		System.out.println("Numbers are,");
		int count = 0;
		int sum = 0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				count++;
				System.out.println(num);
				sum += num;
			}
		}
		int avg = sum / count;
		System.out.println("Found " + count + " numbers which are divisible by 5 & 7");
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	}

	public static void main(String[] args) {
		SumAndAvg_16 sumAndAvg_16 = new SumAndAvg_16();
		sumAndAvg_16.printSumAndAvg(1, 110);
	}
}

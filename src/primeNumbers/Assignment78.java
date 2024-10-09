/*Assignment - 78 : 28th July'2024
find minimum required prime numbers to generate sum 50. 

output : minimum 7 prime numbers are required to generate sum 50.   
Hint : 2 + 3 + 5 + 7 + 11 + 13 + 17 */

package primeNumbers;

public class Assignment78 {

	void printMinNumToGenerateSum() {
		int count = 0;
		int sum = 0;
		int num = 2;
		while (sum < 50) {
			boolean flag = isNumberPrime(num);

			if (flag) {
				sum = sum + num;
				count++;
			}
			num++;
		}
		System.out.println("Minimum " + count + " prime numbers are required to generate sum 50");
	}

	boolean isNumberPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Assignment78 assignment78 = new Assignment78();
		assignment78.printMinNumToGenerateSum();
	}
}

/*Assignment - 74 : 28th July'2024
Find the nth prime number from given range. 

input : 100, 500, 7
output : */

package primeNumbers;

public class Assignment74 {

	boolean isPrimeNum(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	int getNthPrimeNum(int startRange, int endRange, int nth) {
		int count = 0;
		int primeNum = 0;
		for (int num = startRange; num <= endRange; num++) {
			boolean flag = isPrimeNum(num);
			if (flag) {
				count++;
			}
			if (count == nth) {
				primeNum = num;
				break;
			}
		}
		return primeNum;
	}

	public static void main(String[] args) {
		Assignment74 assignment74 = new Assignment74();
		int nth =7;
		int output = assignment74.getNthPrimeNum(100, 500, nth);
		System.out.println(nth + "th prime number in the given range is " + output);
	}
}

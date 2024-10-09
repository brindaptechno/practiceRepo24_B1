/*Assignment - 75 : 28th July'2024

Find the 5th to 8th prime number from given range. 

input : 100 (startRange), 1000 (endRange), 5 (nthStartPrimeNum), 8 (nthEndPrimeNum)
output */

package primeNumbers;

public class Assignment75 {

	boolean isNumPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void printPrimeNumbers(int startRange, int endRange, int nthStartPrimeNum, int nthEndPrimeNum) {
		System.out.println(nthStartPrimeNum + "th to " + nthEndPrimeNum + "th prime numbers " + " in the range "
				+ startRange + " to " + endRange + " are: ");
		int count = 0;
		for (int num = startRange; num <= endRange; num++) {
			boolean flag = isNumPrime(num);
			if (flag) {
				count++;
				if (count >= nthStartPrimeNum && count <= nthEndPrimeNum) {
					System.out.println(num);
				}
				if (count > nthEndPrimeNum) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment75 assignment75 = new Assignment75();
		assignment75.printPrimeNumbers(100, 1000, 5, 8);
	}
}

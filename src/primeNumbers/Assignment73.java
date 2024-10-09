/*Assignment - 73 : 28th July'2024

Print all the prime numbers from given range, print count, sum and average of the available prime numbers in a range.

input : start range 100, end range 200
output : all prime number 
        count of prime number
        sum of all prime number
        avg of all prime number*/

package primeNumbers;

public class Assignment73 {

	void printPrimeNumbersAndPerformOperations(int startRange, int endRange) {
		int count = 0;
		int sum = 0;
		System.out.println("Prime numbers in the range of " + startRange + " to " + endRange + " are:");
		for (int num = startRange; num <= endRange; num++) {
			boolean flag = isNumPrime(num);
			if (flag) {
				System.out.print(num + " ");
				count++;
				sum += num;
			}
		}
		System.out.println();
		System.out.println("Total prime numbers in the given range are " + count);
		System.out.println("Sum = " + sum);
		int avg = sum / count;
		System.out.println("Average = " + avg);
	}

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

	public static void main(String[] args) {
		Assignment73 assignment73 = new Assignment73();
		assignment73.printPrimeNumbersAndPerformOperations(100, 200);
	}
}

/*Assignment - 15 : 21st Jan'2024 [30-40 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36*/

package basic.numbers;

public class Numbers_15 {

	void divisibleNumbers(int startRange, int endRange) {					// we prefer 2nd method to reduce time complexity
		System.out.println("First three numbers divisible by 3 and 4 is:");
		int count = 0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				count++;
				if (count <= 3) {
					System.out.println(num);
				}
			}
		}
	}
	
	void divisibleNumbers1(int startRange, int endRange) {
		System.out.println("First three numbers divisible by 3 and 4 is:");
		int count=0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				count++;
				if(count >3) {
					break;
				}
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		Numbers_15 numbers_15 = new Numbers_15();
		//numbers_15.divisibleNumbers(10, 500);
		numbers_15.divisibleNumbers1(10, 500);
	}
}

/*Assignment - 11 : 2nd Jun'2024 [12- 15 mins]
1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30*/

package basic.numbers;

public class DivNum_11 {

	void divNumbers(int startRange, int endRange) {
		System.out.println("Numbers divisible by 5 & 3 are: ");
		for(int num =startRange; num<=endRange; num++ ) {
			if(num % 5 ==0 && num % 3 ==0) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		DivNum_11 divNum_11 = new DivNum_11();
		divNum_11.divNumbers(5, 40);
	}
}

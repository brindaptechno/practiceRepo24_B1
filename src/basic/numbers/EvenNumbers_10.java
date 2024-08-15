/*Assignment - 10 : 2nd Jun'2024 [12-15 mins]
Write only one program having the following methods.

1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.

Input : Range -> 10 to 15
Output : Even numbers are:
10
12
14

printEvenNum(int startRange, int endRange){
        for(int num=startRange; num<=endRange; num++){
                
        }        
}

printEvenNum(int startRange, int endRange){
        for(; startRange<=endRange; startRange++){
                
        }        
}*/

package basic.numbers;

public class EvenNumbers_10 {

	void printEvenNumbers(int startRange, int endRange) {
		System.out.println("Even numbers are: ");
		for (int num = startRange; num <= endRange; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}

	void printEvenNumbers2(int startRange, int endRange) {
		System.out.println("Even numbers are: ");
		for (; startRange <= endRange; startRange++) {
			if (startRange % 2 == 0) {
				System.out.println(startRange);
			}
		}
	}

	public static void main(String[] args) {
		EvenNumbers_10 evenNumbers_10 = new EvenNumbers_10();
		evenNumbers_10.printEvenNumbers(10, 15);
		evenNumbers_10.printEvenNumbers2(1, 6);
	}
}

/*Assignment - 56 : 

Print all the numbers between startRange to endRange which is div by 5 and 7.

void printNum(int startRange, int endRange){
    
}

Note : Use while loop*/

package whileLoop;

public class Numbers_56 {

	void printNum(int startRange, int endRange) {
		int num = startRange;
		while (num <= endRange) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num + " is divisible by 5 & 7");
			}
			num++;
		}
	}

	public static void main(String[] args) {
		Numbers_56 numbers_56 = new Numbers_56();
		numbers_56.printNum(1, 100);
	}
}

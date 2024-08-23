/*Assignment-24  : 12th June 2024
Write a process data method which will call add,sub,div and multi method, and print the sum of the output of all the methods which were called by process data method.

input : add -> 10,2
           sub -> 14,2
           mul -> 25,2
           div -> 50, 10

output : final output is 79*/

package string;

public class Maths_24 {

	int addition(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	int subtraction(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}
	
	int multiplication(int num1, int num2) {
		int mul = num1 * num2;
		return mul;
	}
	
	int division(int num1, int num2) {
		int div = num1/num2;
		return div;
	}
	
	void processData() {
		int ans1 = addition(10,2);
		int ans2 = subtraction(14,2);
		int ans3 = multiplication(25,2);
		int ans4 = division(50,10);
		int sumOfOutput= ans1 + ans2 + ans3 + ans4;
		System.out.println("Final sum of output is " + sumOfOutput);
	}
	
	public static void main(String[] args) {
		Maths_24 maths_24 = new Maths_24();
		maths_24.processData();
	}
}

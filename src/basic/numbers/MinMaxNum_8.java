package basic.numbers;

public class MinMaxNum_8 {

	void maxNum(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1 + " is bigger between " + num1 + " and " + num2);
		}else if(num2 > num1) {
			System.out.println(num2 + " is bigger between " + num1 + " and " + num2);
		}else if(num1 == num2) {
			System.out.println("Both the given numbers are equal");
		}
	}
	
	void minNum(int num1, int num2) {
		if(num1 < num2) {
			System.out.println(num1 + " is smaller between " + num1 + " and " + num2);
		}else if(num2 < num1) {
			System.out.println(num2 + " is smaller between " + num1 + " and " + num2);
		}else if(num1 == num2) {
			System.out.println("Both the given numbers are equal");
		}
	}
	
	public static void main(String[] args) {
		MinMaxNum_8 minMaxNum_8 = new MinMaxNum_8();
		minMaxNum_8.minNum(10, 17);
		minMaxNum_8.maxNum(10, 17);
	}
}

/*Assignment - 81 : 28th July'2024
write a method to find if number is palindrom.

input : 12321
output : 12321 is a palindrom number.

input : 123123
output : 123123 is not a palindrom number.*/

package palindrom;

public class Assignment81 {

	void isNumPalindrom(int num) {
		int orgNum = num;
		int revNum=0;
		while(num >0) {
			int digit = num % 10;
			revNum = (revNum*10) + digit;
			num = num/10;
		}
		if(orgNum == revNum) {
			System.out.println(orgNum + " is a palindrom number");
		}else {
			System.out.println(orgNum + " is not a palindrom number");
		}
	}
	
	public static void main(String[] args) {
		Assignment81 assignment81 = new Assignment81();
		assignment81.isNumPalindrom(12321);
		assignment81.isNumPalindrom(123123);
	}
}

/*Assignment - 80 : 28th July'2024
write a method which accept number and return the reverse number (without using String).

input :  15243
output : 34251*/

package advanced;

public class Assignment80 {

	int getReverseNumber(int num) {
		int orgNum = num;
		int revNum = 0;
		while (num > 0) {
			int digit = num % 10;
			revNum = (revNum * 10) + digit;
			num = num / 10;
		}

		return revNum;
	}

	int getReverseNumberUsingString(int num) {
		int orgNum = num;
		String revNum = "";
		while (num > 0) {
			int digit = num % 10;
			revNum += digit;
			num = num / 10;
		}
		return Integer.parseInt(revNum);
	}

	public static void main(String[] args) {
		Assignment80 assignment80 = new Assignment80();
		int output = assignment80.getReverseNumber(15243);
		System.out.println("Reversed number -> " + output);

		int output1 = assignment80.getReverseNumberUsingString(15243);
		System.out.println("Reversed number -> " + output1);
	}
}

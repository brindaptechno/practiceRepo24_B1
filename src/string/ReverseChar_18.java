/*Assignment - 18 : 10th Jun'2024 [8-10 mins]

Print the input in reverse order.

input : techno
output : onhcet 

length(), charAt(index)
for : index = input.length()-1*/

package string;

public class ReverseChar_18 {

	void reverseChar(String input) {
		for(int i=input.length()-1; i>=0;i--) {
			char ch = input.charAt(i);
			System.out.print(ch);
		}
	}
	
	public static void main(String[] args) {
		ReverseChar_18 reverseChar_18 = new ReverseChar_18();
		reverseChar_18.reverseChar("techno");
	}
}

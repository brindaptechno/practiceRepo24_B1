/*Assignment - 37 : 30th Jun'2024 [12-15 mins]

write a method which takes one parameter as String array, and print all the elements with its length.

input : {"Maulik", "Technocredits", "Hi"}
output : Maulik -> 6
Technocredits -> 13
Hi -> 2*/

package array;

public class LengthOfElements_37 {

	void printElementsWithLength(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String name = arr[i];
			System.out.println(arr[i] + " -> " + name.length());
		}
	}

	public static void main(String[] args) {
		LengthOfElements_37 lengthOfElements_37 = new LengthOfElements_37();
		String[] input = { "Maulik", "Technocredits", "Hi" };
		lengthOfElements_37.printElementsWithLength(input);
	}
}

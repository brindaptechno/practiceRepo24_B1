/*Assignment - 35 : 30th Jun'2024 [8-10 mins]

Write a method to return ascii value of given character.
Write a method to return character of given ascill value.*/

package ascii;

public class Ascii_35 {

	void getAsciiValue() {

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int value = ch;
			System.out.println(ch + " -> " + value);
		}

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int value1 = ch;
			System.out.println(ch + " -> " + value1);
		}
	}

	void getCharOfAscii() {

		for (int num = 0; num <= 123; num++) {
			char ch = (char) num;
			System.out.println(num + " -> " + ch);
		}
	}

	public static void main(String[] args) {
		Ascii_35 ascii_35 = new Ascii_35();
		ascii_35.getAsciiValue();
		ascii_35.getCharOfAscii();
	}
}

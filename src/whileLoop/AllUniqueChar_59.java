/*Assignment - 59 : 5th July'2024 [IMP]
Print all characters uniquely from given string.
 
 input : aakanksha
 output : aknsh

 Note : Use while loop*/

package whileLoop;

public class AllUniqueChar_59 {

	void printUniqueChar(String input) {
	
		while (input.length() > 0) {
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		AllUniqueChar_59 allUniqueChar_59 = new AllUniqueChar_59();
		allUniqueChar_59.printUniqueChar("aakanksha");
	}
}

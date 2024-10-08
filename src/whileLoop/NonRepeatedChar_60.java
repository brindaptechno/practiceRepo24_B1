package whileLoop;

public class NonRepeatedChar_60 {
	
	void printNonRepeatedChar(String input) {
		
		while(input.length() >0) {
			char ch = input.charAt(0);
			int orgLength = input.length();
			input = input.replace(String.valueOf(ch), "");
			int newLength = input.length();
			
			int freq = orgLength - newLength;
			if(freq == 1) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		NonRepeatedChar_60 nonRepeatedChar = new NonRepeatedChar_60();
		nonRepeatedChar.printNonRepeatedChar("aakanksha");
	}
}

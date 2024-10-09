/*Assignment - 79 : 28th July'2024
write a method which accept number and return the reverse number (use String : charAt & Integer.ParseInt).

input :  15243
output : 34251*/

package string;

public class Assignment79 {

	int getReverseNumber(int input) {
		String strNumber = String.valueOf(input);
		boolean flag = false;
		if(strNumber.charAt(0) == '-') {
			strNumber = strNumber.replace("-", "");
			flag = true;
		}
		String output="";
		for(int index=strNumber.length()-1;index>=0;index--) {
			char ch = strNumber.charAt(index);
			output += ch;
		}
		if(flag) {
			output = "-" + output;
		}
		int answer = Integer.parseInt(output);
		return answer;
	}
	
	public static void main(String[] args) {
		Assignment79 assignment79 = new Assignment79();
		int output = assignment79.getReverseNumber(15243);
		System.out.println(output);
	}
}

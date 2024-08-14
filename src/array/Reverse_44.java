/*Assignment - 44 : 3rd july'2024 [IMP]

input : {"techno", "credits", "pune"}
output : {"onhcet", "stiderc", "enup"}


String revString(String input){
String output = "";
for(int index=input.length()-1;index>=0;index--){
output += input.charAt(index);
}
return output;
}

String[] getRevStringArr(String[] arr){

}

main(){
String[] arr = getRevStringArr();

System.out.println(Arrays.toString(arr));

for(int index=0;index<arr.length;index++){
sop(arr[index]);
}
}*/

package array;

import java.util.Arrays;

public class Reverse_44 {

	String getReverseString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			output += ch;
		}
		return output;
	}

	String[] getReverseArray(String[] arr) {
		String[] newArr = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = getReverseString(arr[i]);
		}
		return newArr;
	}

	public static void main(String[] args) {
		Reverse_44 reverse_44 = new Reverse_44();
		String[] input = { "techno", "credits", "pune" };
		String[] output = reverse_44.getReverseArray(input);
		System.out.println(Arrays.toString(output));
	}
}

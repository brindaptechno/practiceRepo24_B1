/*Assignment - 43 : 3 July'2024

Program 1 : Reverse index order from given Array, write a method to accept an array and return new array by reversing index order.

input : {"Prajakta", "Bhairavi", "Chaitanya", "Vishakha", "Pooja"}
output : {"Pooja", "Vishakha", "Chaitanya", "Bhairavi", "Prajakta"}

Program 2 : Same program as program 1 but on character.

input : {'t', 'o', 'c', 'k', 'l'}
output : {'l', 'k', 'c','o','t'}

Program 3 :

input : {10,33,11,9}
output : {9,11,33,10}

int[] getRevArray(int[] arr){
int[] output = new int[arr.length];
//CODE
return output;
}

int m1(){
int x = 10;
return x;
}
*/
package array;

import java.util.Arrays;

public class ReverseIndex_43 {

	String[] getReverseIndexOrder(String[] arr) {
		String[] newArr = new String[arr.length];
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			newArr[i] = arr[j];
		}
		return newArr;
	}

	char[] getReverseIndexOrder(char[] arr) {
		char[] newArr1 = new char[arr.length];
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			newArr1[i] = arr[j];
		}
		return newArr1;
	}

	int[] getReverseIndexOrder(int[] arr) {
		int[] newArr2 = new int[arr.length];
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			newArr2[i] = arr[j];
		}
		return newArr2;
	}

	public static void main(String[] args) {
		ReverseIndex_43 reverseIndex_43 = new ReverseIndex_43();

		String[] input = { "Prajakta", "Bhairavi", "Chaitanya", "Vishakha", "Pooja" };
		String[] output = reverseIndex_43.getReverseIndexOrder(input);
		System.out.println(Arrays.toString(output));

		char[] input1 = { 't', 'o', 'c', 'k', 'l' };
		char[] output1 = reverseIndex_43.getReverseIndexOrder(input1);
		System.out.println(Arrays.toString(output1));

		int[] input2 = { 10, 33, 11, 9 };
		int[] output2 = reverseIndex_43.getReverseIndexOrder(input2);
		System.out.println(Arrays.toString(output2));
	}
}

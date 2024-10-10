/*Assignment - 88 : 31st July'2024
Find the frequency of number which is repeating in sequence.
input : {10,20,30,30,40,40,40,40,50}

output : 30 -> 2
         40 -> 4

input : {10,20,30,30,30,30,30,30,30}
output : 30 -> 7*/

package arrayListAssignments;

public class Assignment88 {

	void getFrequencyOfNum(int[] arr) {
		int i, j;
		for (i = 0; i < arr.length; i++) {
			int count = 1;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				} else {
					break;
				}
			}
			i = j - 1;
			if (count > 1)
				System.out.println(arr[i] + " -> " + count);
		}
	}

	public static void main(String[] args) {
		Assignment88 assignment88 = new Assignment88();
		int[] arr1 = { 10, 20, 30, 30, 40, 30, 40, 40, 40, 50 };
		assignment88.getFrequencyOfNum(arr1);
		
		int[] arr2 = { 10, 20, 30, 30, 30, 30, 30, 30, 30 };
		assignment88.getFrequencyOfNum(arr2);
	}
}

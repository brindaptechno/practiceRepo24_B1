/*Assignment - 89 : 31st July'2024

Return the ArrayList of all the prime numbers from given ArrayList.

input : [13,17,66,55,44,23]
output : [13, 17, 23]

Hint : method signature should be like below.

ArrayList<Integer> getPrimeNumberList(ArrayList<Integer> listOfNumbers){*/

package arrayListAssignments;

import java.util.*;

public class Assignment89 {

	ArrayList<Integer> getPrimeNumberList(ArrayList<Integer> al) {
		ArrayList<Integer> primeNumberList = new ArrayList<Integer>();

		for (int index = 0; index < al.size(); index++) {
			boolean flag = true;
			for (int i = 2; i < al.get(index); i++) {
				if (al.get(index) % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				primeNumberList.add(al.get(index));
			}
		}

		return primeNumberList;
	}

	public static void main(String[] args) {
		Assignment89 assignment89 = new Assignment89();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(13);
		al.add(17);
		al.add(66);
		al.add(55);
		al.add(23);

		ArrayList<Integer> output = assignment89.getPrimeNumberList(al);
		System.out.println(output);
	}
}

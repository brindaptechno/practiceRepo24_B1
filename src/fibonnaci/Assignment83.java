/*Assignment - 83 : 30th July'2024
print the fibonnaci series first nth number.

input : 8
output : 0,1,1,2,3,5,8,13*/

package fibonnaci;

public class Assignment83 {

	void printFibonnaciSeries(int nth) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1 + ", " + n2);
		for (int count = 3; count <= nth; count++) {
			n3 = n1 + n2;
			System.out.print(", " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		Assignment83 assignment83 = new Assignment83();
		assignment83.printFibonnaciSeries(8);
	}

}

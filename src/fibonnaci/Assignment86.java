/*Assignment - 86 : 30th July'2024
print the fibonnaci series from range 100 to 500.*/

package fibonnaci;

public class Assignment86 {

	void printFibonnaciSeries(int startRange, int endRange) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		while (n3 <= endRange) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			if (n3 >= startRange && n3 <= endRange) {
				System.out.println(n3);
			}
		}
	}

	public static void main(String[] args) {
		Assignment86 assignment86 = new Assignment86();
		assignment86.printFibonnaciSeries(100, 500);
	}
}

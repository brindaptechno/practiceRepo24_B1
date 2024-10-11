/*Assignment - 85 : 30th July'2024
print the fibonnaci series from range 0 to 100.*/

package fibonnaci;

public class Assignment85 {

	void printFibonnaciSeries(int endRange) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1 + ", " + n2);
		while (n3 <= endRange) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			if (n3 <= endRange) {
				System.out.print(", " + n3);
			}
		}
	}

	public static void main(String[] args) {
		Assignment85 assignment85 = new Assignment85();
		assignment85.printFibonnaciSeries(100);
	}
}

/*Assignment - 84 : 30th July'2024
how many minimum numbers are required to generate sum 50 in the fibonnaci series.

input : 50
output : 9*/

package fibonnaci;

public class Assignment84 {

	void printMinimumNumToGenerateSum(int num) {
		int sum=1;
		int n1=0;
		int n2=1;
		int n3=0;
		int count=2;
		while(sum < 50) {
			n3 = n1 + n2;
			sum = sum + n3;
			n1 =n2;
			n2=n3;
			count++;
		}
		System.out.println("Minimum numbers required to generate sum 50 are "+ count);
	}
	
	public static void main(String[] args) {
		Assignment84 assignment84 = new Assignment84();
		assignment84.printMinimumNumToGenerateSum(50);
	}
}

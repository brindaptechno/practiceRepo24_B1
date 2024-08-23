/*Assignment 23 : 12th June 2024 

Create two method where 1st method would calculate sum from 1 to 10 and 2nd method to get average of sum, print average in main method
input : 1+ 2+ +...+10
output : Average of sum 10 numbers from 1 to 10 is 5*/

package string;

public class SumAndAvg_23 {

	int sum() {
		int sum=0;
		for(int num=1; num<=10;num++) {
			sum = sum+num;
		}
		return sum;
	}
	
	double avgOfSum() {
		double avg = (double)sum()/10;
		return avg;
	}
	
	public static void main(String[] args) {
		SumAndAvg_23 sumAndAvg_23 = new SumAndAvg_23();
		double output = sumAndAvg_23.avgOfSum();
		System.out.println("Average of sum of 10 numbers from 1 to 10 is " + output);
	}
}

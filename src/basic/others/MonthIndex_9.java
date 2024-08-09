/*Assignment - 9 : 31st May'2024 
Please use nested if else for below requirement.
Based on month index, print quarter and name of the month. 

1 to 3 -> Q1
4 to 6 -> Q2
7 to 9 -> Q3
10 to 12 -> Q4 

input : 5
output : Month index 5 is in Q2, its May.

input : 2
output : Month index 2 is in Q1, its Febuary.

input : -3 
output: invalid month index, it can't be negative. 

input : 13
output: invalid month index, it can't be greater than 13.*/

package basic.others;

public class MonthIndex_9 {

	void monthIndex(int index) {
		if (index >= 1 && index <= 3) {
			if (index == 1) {
				System.out.println("Month Index 1 is in Q1, its January");
			} else if (index == 2) {
				System.out.println("Month Index 2 is in Q1, its February");
			} else if (index == 3) {
				System.out.println("Month Index 3 is in Q1, its March");
			}

		} else if (index >= 4 && index <= 6) {
			if (index == 4) {
				System.out.println("Month Index 4 is in Q2, its April");
			} else if (index == 5) {
				System.out.println("Month Index 5 is in Q2, its May");
			} else if (index == 6) {
				System.out.println("Month Index 6 is in Q2, its June");
			}

		} else if (index >= 7 && index <= 9) {
			if (index == 7) {
				System.out.println("Month Index 7 is in Q3, its July");
			} else if (index == 8) {
				System.out.println("Month Index 8 is in Q3, its August");
			} else if (index == 9) {
				System.out.println("Month Index 9 is in Q3, its September");
			}

		} else if (index >= 10 && index <= 12) {
			if (index == 10) {
				System.out.println("Month Index 10 is in Q4, its October");
			} else if (index == 11) {
				System.out.println("Month Index 11 is in Q4, its November");
			} else if (index == 12) {
				System.out.println("Month Index 12 is in Q4, its December");
			}
		} else if (index > 12) {
			System.out.println("Invalid Month Index, it cannot be greater than 12");
		} else if (index < 0) {
			System.out.println("Invalid Month Index, it cannot be negative");
		} else if (index == 0) {
			System.out.println("Invalid Month Index, it cannot be Zero");
		}
	}

	public static void main(String[] args) {
		MonthIndex_9 monthIndex_9 = new MonthIndex_9();
		monthIndex_9.monthIndex(5);
		monthIndex_9.monthIndex(2);
		monthIndex_9.monthIndex(-3);
		monthIndex_9.monthIndex(13);
	}
}

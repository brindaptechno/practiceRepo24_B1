/*Assignment - 4 : 28th May'2024
Write a program that perform below operations.
Create a class called BankDetails.
Init balance is 1000
Create 2 parameterized methods [debitAmt, creditAmt] and  printBalance which should print current balance.

Inputs :
debitAmt(300)
creditAmt(500)
creditAmt(200)
creditAmt(800)
debitAmt(1800)
printBalance()
Output :
Now your current balance is 400*/

package Bank;

public class BankDetails_4 {
	int balance = 1000;

	void debitAmt(int amount) {
		balance = balance - amount;
	}

	void creditAmt(int amount) {
		balance = balance + amount;
	}

	void printBalance() {
		System.out.println("Now your current balance is ₹" + balance);
	}

	public static void main(String[] args) {
		BankDetails_4 bankDetails_4 = new BankDetails_4();
		bankDetails_4.debitAmt(300);
		bankDetails_4.creditAmt(500);
		bankDetails_4.creditAmt(200);
		bankDetails_4.creditAmt(800);
		bankDetails_4.debitAmt(1800);
		bankDetails_4.printBalance();
	}
}

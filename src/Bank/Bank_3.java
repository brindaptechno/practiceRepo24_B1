/*Assignment - 3 : 27th May'2024
Write a program that perform below operations.
Create a class called Bank.
Init balance is 1000
Create 3 methods [debitAmt, creditAmt, printBalance]
Inputs :
debitAmt
creditAmt
creditAmt
creditAmt
debitAmt
printBalance
Output :
Now your current balance is 1500

Rule : Debit amount should deduct 200 rs from balance, credit amount should add 300 rs in balance.*/

package Bank;

public class Bank_3 {
	int balance = 1000;

	void debitAmt() {
		balance = balance - 200;
	}

	void creditAmt() {
		balance = balance + 300;
	}

	void printBalance() {
		System.out.println("Now your current balance is ₹" + balance);
	}

	public static void main(String[] args) {
		Bank_3 bank_3 = new Bank_3();
		bank_3.debitAmt();
		bank_3.creditAmt();
		bank_3.creditAmt();
		bank_3.creditAmt();
		bank_3.debitAmt();
		bank_3.printBalance();
	}
}

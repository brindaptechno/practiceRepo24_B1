/*Assignment - 5 : 29th May'2024
Create a call called BankDetail and print how many time debit, credit and printstatement method has been called. 
Instance variable can be balance = 1000, debitCount, creditCount, printStatementCount.
printCountInfo method should show how many times debit,credit and printStatement method has been called.

from main method calling sequence should be as follow : 
debitAmt(300)
creditAmt(500)
creditAmt(300)
creditAmt(500)
printStatement()   [this method should print remaining balance]
printCountInfo()    

output :
remaining balance is 2000
debit method call count -> 1
credit method call count -> 3
printstatment method call count -> 1*/

package Bank;

public class BankDetail_5 {
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;

	void debitAmt(int amount) {
		balance = balance - amount;
		debitCount++;
	}

	void creditAmt(int amount) {
		balance = balance + amount;
		creditCount++;
	}

	void printStatement() {
		System.out.println("Now your current balance is ₹" + balance);
		printStatementCount++;
	}

	void printCountInfo() {
		System.out.println("Debit method call count -> " + debitCount);
		System.out.println("Credit method call count -> " + creditCount);
		System.out.println("PrintStatement method call count -> " + printStatementCount);
	}

	public static void main(String[] args) {
		BankDetail_5 bankDetail_5 = new BankDetail_5();
		bankDetail_5.debitAmt(300);
		bankDetail_5.creditAmt(500);
		bankDetail_5.creditAmt(300);
		bankDetail_5.creditAmt(500);
		bankDetail_5.printStatement();
		bankDetail_5.printCountInfo();
	}
}

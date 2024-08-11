/*Assignment - 6 : 30th May'2024
NOTE : Add appropiate condition before debit and credit operation. on successful operation only count should be incremented. 
Create a call called BankDetail and print how many time debit, credit and printstatement method has been called. 
Instance variable can be balance = 1000, debitCount, creditCount, printStatementCount.
printCountInfo method should show how many times debit,credit and printStatement method has been called.

from main method calling sequence should be as follow : 
debitAmt(1300)
printStatement()
creditAmt(500)
creditAmt(-300)
creditAmt(500)
debitAmt(200)
debitAmt(2000)
printStatement()   [this method should print remaining balance]
printCountInfo()    

output :
Insufficient found, 1300 cant be debited as current balance is 1000.
remaining balance is 1000
you are trying to credit -300 rs, negative amount can not be credited.
Insufficient found, 2000 cant be debited as current balance is 1800.
remaining balance is 1800

debit method call count -> 1
credit method call count -> 2
printstatment method call count -> 2*/

package Bank;

public class BankDetail_6 {
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;

	void debitAmt(int amount) {
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
			debitCount++;
		}else if(amount > balance) {
			System.out.println("Insufficient funds, ₹" + amount + " cannot be debited as current balance is ₹" + balance);
		}else if (amount <0) {
			System.out.println("You are trying to debit ₹" + amount + ", negative amount cannot be debited");
		}else if (amount == 0) {
			System.out.println("Invalid amount");
		}
	}
	
	void creditAmt(int amount) {
		if(amount > 0) {
			balance = balance + amount;
			creditCount++;
		}else if(amount <0) {
			System.out.println("You are trying to credit ₹" + amount + ", negative amount cannot be credited");
		}else if(amount == 0) {
			System.out.println("Invalid amount");
		}
	}
	
	void printStatement() {
		System.out.println("Current balance is ₹" + balance);
		printStatementCount++;
	}
	
	void printCountInfo() {
		System.out.println("Debit method call count -> " + debitCount);
		System.out.println("Credit method call count -> " + creditCount);
		System.out.println("Print Statement call count -> " + printStatementCount);
	}
	
	public static void main(String[] args) {
		BankDetail_6 bankDetail_6 = new BankDetail_6();
		bankDetail_6.debitAmt(1300);
		bankDetail_6.printStatement();
		bankDetail_6.creditAmt(500);
		bankDetail_6.creditAmt(-300);
		bankDetail_6.creditAmt(500);
		bankDetail_6.debitAmt(200);
		bankDetail_6.debitAmt(2000);
		bankDetail_6.printStatement();
		bankDetail_6.printCountInfo();
	}
}

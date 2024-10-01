package inheritance;

public class Customer extends Business {
	int customerId;
	String customerName;
	int invoiceValue;
	
	@Override
	void setDetails() {
		customerId = 10600;
		customerName="Jose";
		invoiceValue = 18100;
	}
	
	void printData() {
		System.out.println(customerId + ": " + customerName + " -> $" + invoiceValue);
	}
}

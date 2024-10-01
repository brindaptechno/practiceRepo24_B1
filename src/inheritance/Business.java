package inheritance;

public class Business {
	int customerId;
	String customerName;
	
	void setDetails() {
		customerId = 11011;
		customerName = "Tania";
	}
	
	void displayData() {
		System.out.println(customerId + ": " + customerName);
	}
}

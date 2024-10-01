package inheritance;

public class Business_Case2 {

	public static void main(String[] args) {
		System.out.println("Inheritance Case2");
		Customer customer= new Customer();
		customer.setDetails();
		customer.printData();
		customer.displayData();
		System.out.println(customer.customerId);
		System.out.println(customer.customerName);
		System.out.println(customer.invoiceValue);
	}
}

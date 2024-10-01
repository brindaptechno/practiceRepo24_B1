package inheritance;

public class Business_Case3 {

	public static void main(String[] args) {
		System.out.println("Inheritance Case3");
		Business business = new Customer();
		business.setDetails();
		System.out.println(business.customerId);
		System.out.println(business.customerName);
		//System.out.println(business.invoiceValue); CE reference type can take guarantee of only members of business class
		business.displayData();
		//business.printData(); CE reference type can take guarantee of only members of business class
		
	}
}

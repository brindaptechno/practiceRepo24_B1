package inheritance;

public class Business_Case1 {

	public static void main(String[] args) {
		System.out.println("Inheritance Case1");
		Business business = new Business();
		business.setDetails();
		System.out.println(business.customerId); 
		System.out.println(business.customerName);
		//System.out.println(business.invoiceValue); CE cannot access members of child class
		business.displayData();
		business.setDetails();
		//business.printData(); CE reference type cannot take guarantee of variables and methods which are not accessible to it
	}
}

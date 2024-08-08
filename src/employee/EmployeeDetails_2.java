/*Assignment - 2 : 26th May'2024
Create a class called EmployeeDetails having following instance variable.
firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

create 5 methods.
1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
2) updateSecondaryInfo() -> address, phoneNumber
3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
4) displayOtherInfo() -> address, phoneNumber
5) displayAllInfo() ->  firstName, lastName, empId, managerId, address, phoneNumber*/

package employee;

public class EmployeeDetails_2 {
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;

	void updatePrimaryInfo() {
		firstName = "Brinda";
		lastName = "Patel";
		empId = 385;
		managerId = 10;
	}

	void updateSecondaryInfo() {
		address = "High Street, Rajkot - 360004";
		phoneNumber = "+91 7567534101";
	}

	void displayPrimaryInfo() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Employee ID: " + empId);
		System.out.println("Manager ID: " + managerId);
	}

	void displayOtherInfo() {
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNumber);
	}

	void displayAllInfo() {
		displayPrimaryInfo();
		displayOtherInfo();
	}

	public static void main(String[] args) {
		EmployeeDetails_2 employeeDetails_2 = new EmployeeDetails_2();
		employeeDetails_2.updatePrimaryInfo();
		employeeDetails_2.updateSecondaryInfo();
		employeeDetails_2.displayAllInfo();
	}
}

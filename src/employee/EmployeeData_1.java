package employee;

/*Assignment - 1 : 25th May'2024 
Employee class requirement : 
Employee has name and id, it should be printable.
Hint : name should be String, id should be int.*/ 

package employee;

public class EmployeeData_1 {

	String name = "Brinda";
	int empId = 385;

	void printEmployeeData() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + empId);
	}

	public static void main(String[] args) {
		EmployeeData_1 employeeData_1 = new EmployeeData_1();
		employeeData_1.printEmployeeData();
	}
}

//(3 min)

package org.emp;

public class Employee {
	
	private void empId() {
        System.out.println("Employee ID: 07");
	}
	
	private void empName() {
        System.out.println("Employee Name: Siva");
	}
	
	private void empDob() {
        System.out.println("Employee D.O.B: 19-06-2004");
	}
	
	private void empPhone() {
        System.out.println("Employee Phone Number: 7639002178");
	}
	
	private void empMail() {
        System.out.println("Employee Mail ID: msv@gmail.com");
	}
	
	private void empAddress() {
        System.out.println("Employee Address: Madurai, Tamilnadu");
	}

	public static void main(String[] args) {
		
        Employee employee = new Employee();
        
        employee.empId();
        employee.empName();
        employee.empDob();
        employee.empMail();
        employee.empPhone();
        employee.empAddress();
	}

}

package org.emp;

//Child Class

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	
	public void empName() {
		System.out.println("Employee Name: Vishwa");
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.empName();
		
		Company company = new Company();
		company.companyName();
		
		Client client = new Client();
		client.clientName();
		
		Project project = new Project();
		project.projectName();
		
	}

}

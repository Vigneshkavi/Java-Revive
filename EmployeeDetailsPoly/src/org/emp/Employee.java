package org.emp;

public class Employee {
	public void empId() {
		System.out.println("Employee ID with No Arguments");
	}
	
	public void empId(int id) {
		System.out.println("Employee ID (int): " + id );
	}
	
	public void empId(String id) {
		System.out.println("Employee ID (String): " + id);
	}
	
	public void empId(long id) {
		System.out.println("employee ID (long): " + id);
	}
	
	public void empId(double id) {
		System.out.println("Employee ID (double): " + id);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empId(66);
		e.empId("A123F");
		e.empId(78484856393L);
		e.empId(25.55);
		
	}

}

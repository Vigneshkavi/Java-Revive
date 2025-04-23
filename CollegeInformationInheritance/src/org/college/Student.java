package org.college;

//Final Child Class

public class Student extends College {
	public void studentName() {
		System.out.println("Student Name: Arun");
	}
	
	public void studentDept() {
		System.out.println("Student Department: Mech");
	}
	
	public void studentId() {
		System.out.println("Student ID: 08");
	}
	
	public static void main(String[] args) {
		Student info = new Student();
		
		info.studentName();
		info.studentDept();
		info.studentId();
		info.collegeName();
		info.collegeCode();
		info.collegeRank();
		info.hostelName();
		info.deptName();
	}

}

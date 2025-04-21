package org.college;

//Child class

public class College {
	
	private void collegeName() {
		System.out.println("College Name: Paavai Institutions");
	}
	
	private void collegeCode() {
		System.out.println("College Code: 2003");
	}
	
	private void collegeRank() {
		System.out.println("College Rank: 1st");
	}

	public static void main(String[] args) {
		College college = new College();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		
		Student student = new Student();
		student.studentName();
		student.studentDept();
		student.studentId();
		
		Hostel hostel = new Hostel();
		hostel.hostelName();
		
		Dept dept = new Dept();
		dept.deptName();
	}

}

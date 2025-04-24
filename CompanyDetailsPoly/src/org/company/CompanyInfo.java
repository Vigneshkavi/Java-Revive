package org.company;

public class CompanyInfo {
	public void companyName() {
        System.out.println("Default Company: ROX");
	}
	
	public void companyName(String name) {
		System.out.println("Company Name: " + name);
	}
	
	public void companyName(String name, int yearFounded) {
		System.out.println("Company Name: " + name + ", Founded in: " + yearFounded );
	}
	
	public void companyName(String name, int yearFounded, String location ) {
		System.out.println("Company Name: " + name + ",Founded In: " + yearFounded + ", Located in: " + location);
	}
	
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		
		c.companyName();
		c.companyName("Dragon");
		c.companyName("Dragon", 1995);
		c.companyName("Dragon", 1995, "TN");
	}

}

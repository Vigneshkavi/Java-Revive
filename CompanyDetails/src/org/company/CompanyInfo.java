package org.company;

public class CompanyInfo {
    
	private void companyId() {
		System.out.println("Company ID: DC1002");
	}
	
	private void companyName() {
		System.out.println("Company Name: AKS");
	}
	
	private void companyAddress() {
		System.out.println("Company Address: Chennai, Tamilnadu");
	}
	
	
	public static void main(String[] args) {
		
		CompanyInfo company = new CompanyInfo();
		
		company.companyId();
		company.companyName();
		company.companyAddress();

	}

}

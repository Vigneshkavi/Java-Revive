package org.company;

//Final Child class

import org.client.Client;

public class Company extends Client {
	public void companyName() {
		System.out.println("Company Name: DCC");
	}

	public static void main(String[] args) {
        Company info = new Company();
        
        info.companyName();
        info.clientName();
	}

}

package org.bank;

//Final Child Class

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("Saving Account");
	}
	
	public void fixed() {
		System.out.println("Fixed Amount");
	}
	
	public static void main(String[] args) {
		BankInfo info = new BankInfo();
		
		info.saving();
		info.fixed();
		info.deposit();
	}

}

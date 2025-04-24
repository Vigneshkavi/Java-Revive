package org.bank;

public class AxisBank extends BankInfo{
	@Override
	public void deposit() {
		System.out.println("Deposit Amount: Rs 1");
//		super.deposit();
	}
	
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		
		a.saving();
		a.fixed();
		a.deposit();
	}

}

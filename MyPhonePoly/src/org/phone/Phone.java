package org.phone;

public class Phone {
	public void phoneInfo(String model, int price) {
		System.out.println("Phone Model: " + model + ", Phone Price: " + price);

	}
	
	public void phoneInfo(int price, String model) {
		System.out.println("Phone Price: " + price + ", Phone Model: " + model);
	}
	
	public void phoneInfo(String model, double size) {
		System.out.println("Phone Model: " + model + ", Screen Size: " + size + " Inches");
	}
	
	public void phoneInfo(double size, String model) {
		System.out.println("Screen Size: " + size + " Inches" + ", Phone Model: " + model);
	}
	
	public static void main(String[] args) {
		Phone p = new Phone();
		
		p.phoneInfo("Galaxy S22", 500000);
		p.phoneInfo(49999, "MotoG85");
		p.phoneInfo("Apple", 6.1);
		p.phoneInfo(6.1, "Apple");
	}

}

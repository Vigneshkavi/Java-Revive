package org.phone;

public class PhoneInfo {
	
	private void phoneName() {
		System.out.println("Phone Name: Moto");
	}
	
	private void phoneMieiNum() {
		System.out.println("Phone MIEI Number: 6428472944");
	}
	
	private void Camera() {
		System.out.println("Camera Pixel: 50");
	}
	
	private void Storage() {
		System.out.println("Phone Storage: 128GB");
	}
	
	private void osName() {
		System.out.println("OS Name: Android OS");
	}
	
	public static void main(String[] args) {
		
		PhoneInfo phone = new PhoneInfo();
		
		phone.phoneName();
		phone.phoneMieiNum();
		phone.Camera();
		phone.Storage();
		phone.osName();
	}

}

package com.computer;

//Final Child Class

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size: 22 inch");
	}
	
	public static void main(String[] args) {
		Desktop info = new Desktop();
		
		info.desktopSize();
		info.computerModel();
	}

}

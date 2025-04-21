package org.network;

//Child Class

public class Wifi {
	
	private void wifiName() {
		System.out.println("SSID Name: *****");
	}
	
	public static void main(String[] args) {
		Wifi wifi = new Wifi();
		wifi.wifiName();
		
		MobileData md = new MobileData();
		md.dataName();
		
		Lan lan = new Lan();
		lan.lanName();
		
		Wireless wl = new Wireless();
		wl.modemName();
	}

}

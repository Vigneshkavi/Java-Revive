package org.edu;

//Final Child Class

public class Education extends Medicine {
	public void ug() {
		System.out.println("UG: BE");
	}
	
	public void pg() {
		System.out.println("PG: ME");
	}
	
	public static void main(String[] args) {
		Education info = new Education();
		
		info.ug();
		info.pg();
		info.bsc();
		info.bBA();
		info.bEd();
		info.bA();
		info.bTech();
		info.bE();
		info.physio();
		info.dental();
		info.mbbs();
	}

}

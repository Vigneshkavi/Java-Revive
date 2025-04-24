package org.edu;

//import java.lang.Thread.UncaughtExceptionHandler;
//import java.util.prefs.BackingStoreException;

public class Arts extends Education {
	private void bSc() {
		System.out.println("BSC Completed: Ganesh");

	}
	
	private void bEd() {
		System.out.println("BED Completed: Suresh");

	}
	
	private void bA() {
		System.out.println("BA Completed: Ram");
		
	}
	
	private void bBA() {
		System.out.println("BBA Completed: Janu");

	}
	
	private void ug(String name) {
		System.out.println("UG Completed: " + name);

	}
	
	private void pg(String name) {
		System.out.println("PG Completed: " + name);

	}
	
	@Override
	public void ug() {
		System.out.println("UG Override From Super Class ");
//		super.ug();
	}
	
	@Override
	public void pg() {
		System.out.println("PG Override From Super Class");
//		super.pg();
	}
	
	public static void main(String[] args) {
		Arts a = new Arts();
		
		a.bA();
		a.bBA();
		a.bEd();
		a.bSc();
		a.pg("Guna From Sub Class");
		a.ug("Visha From Sub Class");
		a.ug();
		a.pg();
	}

}

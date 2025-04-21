package org.phone;

//Child class

public class InternalStorage {
	
	private void processorName() {
		System.out.println("Processor Name: Snapdragon 8th Gen 3");
	}
	
	private void ramSize() {
		System.out.println("Ram Size: 16GB");
	}

	public static void main(String[] args) {
        InternalStorage is = new InternalStorage();
        is.processorName();
        is.ramSize();
        
        ExternalStorage es = new ExternalStorage();
        es.size();
	}

}

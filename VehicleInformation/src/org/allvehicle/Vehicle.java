package org.allvehicle;

//Child Class

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	
	private void vehicleNecessery() {
		System.out.println("Vehicle Necessery = Spare Parts");
	}
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.vehicleNecessery();
		
		TwoWheeler tw = new TwoWheeler();
		tw.bike();
		tw.cycle();
		
		ThreeWheeler twh = new ThreeWheeler();
		twh.auto();
		
		FourWheeler fw = new FourWheeler();
		fw.bus();
		fw.car();
		fw.lorry();
	}

}

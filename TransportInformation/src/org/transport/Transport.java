package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	
	private void transportform() {
		System.out.println("Transport form");
	}
	
	public static void main(String[] args) {
		Transport transport = new Transport();
		transport.transportform();
		
		Road road = new Road();
		road.bike();
		road.bus();
		road.car();
		road.cycle();
		
		Air air = new Air();
		air.aeroPlane();
		air.helicoptor();
		
		Water water = new Water();
		water.boat();
		water.ship();
	}

}

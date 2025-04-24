package org.univ;

public class College extends University {
	@Override
	public void ug() {
		System.out.println("UG Course: BE, B.Tech - Duration: 4 Years");
//		super.ug();
	}
	
	@Override
	public void pg() {
		System.out.println("PG Course: ME, M.Tech - Duration: 2 Years");
//		super.pg();
	}
	
	public static void main(String[] args) {
		College c = new College();
		
		c.ug();
		c.pg();
	}

}

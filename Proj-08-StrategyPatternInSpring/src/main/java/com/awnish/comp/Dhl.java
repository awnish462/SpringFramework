package com.awnish.comp;

public class Dhl implements Courier{
	public Dhl() {
		// TODO Auto-generated constructor stub
		System.out.println("Dhl.Dhl()");
	}

	@Override
	public String deliver(int oid) {
		return oid+ "order id is  delivered by DHL";
		
	}

}

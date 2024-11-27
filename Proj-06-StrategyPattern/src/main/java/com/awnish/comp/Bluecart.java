package com.awnish.comp;

public class Bluecart implements Courier{
	public Bluecart() {
		// TODO Auto-generated constructor stub
		System.out.println("Bluecart.Bluecart()");
	}
	
	public String deliver(int oid) {
		return oid+"order id is delivered by BlueCart";
	}
	

}

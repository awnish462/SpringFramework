package com.awnish.comp;

public class Dtdc implements Courier {
public Dtdc() {
	// TODO Auto-generated constructor stub
	System.out.println("Dtdc.Dtdc()");
}

	@Override
	public String deliver(int oid) {
		return oid+" order id is deliverd by DTDC";
	}
}

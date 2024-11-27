package com.awnish.Factory;

import com.awnish.comp.Bluecart;
import com.awnish.comp.Courier;
import com.awnish.comp.Dhl;
import com.awnish.comp.Dtdc;
import com.awnish.comp.Flipkart;

public class FlipkartFactory {
	
	//implementing Factory Pattern with Strategy Pattern
	public static Flipkart createFlipkart(String courierType) {
		Flipkart fpkt=new Flipkart();
		Courier courier=null;
		
		if(courierType.equalsIgnoreCase("dhl")) {
			courier = new Dhl();
		}else if(courierType.equalsIgnoreCase("bluecart")) {
			courier=new Bluecart();
		}else if(courierType.equalsIgnoreCase("dtdc")) {
			courier=new Dtdc();
		}else {
			throw new IllegalArgumentException("Invalid courier type");
		}
		fpkt.setCourier(courier);
		return fpkt;
		
	}

}

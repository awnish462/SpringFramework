package com.awnish.comp;

import java.util.Arrays;
import java.util.Random;

final public class Flipkart{
	private Courier courier;
	
	public Flipkart() {
		// TODO Auto-generated constructor stub
		System.out.println("Flipkart.Flipkart()");
	}
	
	public void setCourier(Courier courier) {
		this.courier=courier;
	}
	
	public String shopping(String items[],float price[]) {
		float billAmt=0.0f;
		for(int i=0;i<price.length;i++) {
			billAmt+=price[i];
			
		}
		int oid=new Random().nextInt(1000000);
		
		String status=courier.deliver(oid);
		String finalMessage=Arrays.toString(items)+"are purchaged with prices" + Arrays.toString(price)+"The generated bill amount is "+ billAmt;
		
		return finalMessage;
		
	}
	
	
	
}

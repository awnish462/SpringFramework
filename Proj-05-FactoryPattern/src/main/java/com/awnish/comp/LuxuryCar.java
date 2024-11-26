package com.awnish.comp;

public class LuxuryCar implements Car {
	private String regno;
	
	public LuxuryCar(String regno) {
		this.regno=regno;
	}
	@Override
	public void drive() {
		System.out.println("LuxuryCar.drive()");
	}

}

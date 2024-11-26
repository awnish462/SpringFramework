package com.awnish.comp;

public class SportsCar implements Car {
	private String regno;
	
	public SportsCar(String regno) {
		this.regno=regno;
	}
	@Override
	public void drive() {
		System.out.println("SportsCar.drive()");
		
	}

}

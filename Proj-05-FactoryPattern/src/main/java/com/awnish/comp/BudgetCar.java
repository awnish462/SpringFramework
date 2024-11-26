package com.awnish.comp;

public class BudgetCar implements Car {
	private String regno;
	
	public BudgetCar(String regno) {
		
		this.regno=regno;
	}
	@Override
	public void drive() {
	System.out.println("BudgetCar.drive()");
		
	}
	
}

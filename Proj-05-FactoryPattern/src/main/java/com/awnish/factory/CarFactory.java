package com.awnish.factory;

import com.awnish.comp.BudgetCar;
import com.awnish.comp.Car;
import com.awnish.comp.LuxuryCar;
import com.awnish.comp.SportsCar;

public class CarFactory {
	
	public static Car createCar(String type,String regno) {
		if(type.equalsIgnoreCase("luxury")){
			return new LuxuryCar(regno);
		}else if(type.equalsIgnoreCase("budget")) {
			return new BudgetCar(regno);
		}else if(type.equalsIgnoreCase("sports")) {
			return new SportsCar(regno);
		}else
			throw new IllegalArgumentException("Illegal Input");
	}

}

package com.awnish.test;

import com.awnish.comp.Car;
import com.awnish.factory.CarFactory;

public class SportsCustomer {

	public static void main(String[] args) {
		
		Car car=CarFactory.createCar("sports","FE5333T3232");
		car.drive();

	}

}

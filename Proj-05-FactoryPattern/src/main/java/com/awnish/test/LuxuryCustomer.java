package com.awnish.test;

import com.awnish.comp.Car;
import com.awnish.factory.CarFactory;

public class LuxuryCustomer {

	public static void main(String[] args) {
		Car car=CarFactory.createCar("luxury", "BH025T033");
		car.drive();

	}

}

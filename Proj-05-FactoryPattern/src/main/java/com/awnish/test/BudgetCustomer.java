package com.awnish.test;

import com.awnish.comp.Car;
import com.awnish.factory.CarFactory;

public class BudgetCustomer {

	public static void main(String[] args) {
		Car car=CarFactory.createCar("budget", "T923 T02");
		car.drive();
	}

}

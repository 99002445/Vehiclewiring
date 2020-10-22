package com.lts.vehiclewiring;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator{

	@Override
	public void showMileage() {
		System.out.println("Car Mileage is...");
	}

}

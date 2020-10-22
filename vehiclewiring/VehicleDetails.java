package com.lts.vehiclewiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleDetails {
	@Autowired
	@Qualifier("car")
	MileCalculator carCalculator;
	@Autowired
	@Qualifier("bike")
	MileCalculator bikeCalculator;
	public void getMileage(String choice) {
		if(choice.equals("Car"))
			carCalculator.showMileage();
		else
			bikeCalculator.showMileage();
	}
}

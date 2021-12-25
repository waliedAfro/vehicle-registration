package com.inspection.service;

import java.util.List;

import com.inspection.model.Vehicle;

public interface VehicleService {

	public List<Vehicle> getAllVehicle();

	public Vehicle saveVehicle(Vehicle model);

	public Vehicle updateVehicle(Vehicle model);

	public Vehicle getVehicle(Long pk);
	
	public void deleteVehicle(Long pk) ;

}

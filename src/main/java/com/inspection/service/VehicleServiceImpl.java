package com.inspection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inspection.model.Vehicle;
import com.inspection.repository.VehicleRepository;
@Service
public class VehicleServiceImpl implements VehicleService {

	private VehicleRepository vehicleRepository ; 
	
	
	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
	}

	
	@Override
	public List<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		return vehicleRepository.findAll();
	}

	@Override
	public Vehicle saveVehicle(Vehicle model) {
		// TODO Auto-generated method stub
		return vehicleRepository.save(model);
	}

	@Override
	public Vehicle updateVehicle(Vehicle model) {
		// TODO Auto-generated method stub
		return vehicleRepository.save(model);
	}

	@Override
	public Vehicle getVehicle(Long pk) {
		// TODO Auto-generated method stub
		return vehicleRepository.getById(pk);
	}


	@Override
	public void deleteVehicle(Long pk) {
		// TODO Auto-generated method stub
		vehicleRepository.deleteById(pk);
	}

}

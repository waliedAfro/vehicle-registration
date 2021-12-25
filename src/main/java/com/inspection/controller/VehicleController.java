package com.inspection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inspection.model.Vehicle;
import com.inspection.service.VehicleService;

@Controller
@RequestMapping("/ins/")
public class VehicleController {

	private VehicleService vehicleService;

	public VehicleController(VehicleService vehicleService) {
		super();
		this.vehicleService = vehicleService;
	}

	// List out all vehicle hander
	@GetMapping("/vehicle")
	public String getAllVehicle(Model model) {
		model.addAttribute("vehicles", vehicleService.getAllVehicle());
		return "vehicles";
	}

	// route from vehicles page to create new vehicle handler
	@GetMapping("/route-create")
	public String routeToCreatVehicle(Model model) {
		Vehicle vehicle = new Vehicle();
		model.addAttribute("vehicle", vehicle);
		return "create-vehicle";
	}

	// create vehicle handler
	@PostMapping("/create")
	public String createVehicle(@ModelAttribute("vehicle") Vehicle vehicle) {
		vehicleService.saveVehicle(vehicle);
		return "redirect:vehicle";
	}

	// route from vehicles page to update vehicle handler
	@GetMapping("/route-update/{id}")
	public String routeToUpdate(@PathVariable(name = "id") Long pk, Model model) {
		model.addAttribute("vehicle", vehicleService.getVehicle(pk));
		return "update-vehicle";
	}

	// updat vehicle handler
	
	@PostMapping("/update/{id}")
	public String updateVehicle(@PathVariable(name = "id") Long pk, @ModelAttribute Vehicle vehicle) {
		Vehicle model = vehicleService.getVehicle(pk);

		model.setBrand(vehicle.getBrand());
		model.setChassNo(vehicle.getChassNo());
		model.setModel(vehicle.getModel());
		model.setModelYear(vehicle.getModelYear());
		vehicleService.updateVehicle(model);

		return "redirect:/ins/vehicle"; 
	}
	
	//delete Vehicle 
	@GetMapping("/delete/{id}")
	public String deleteVehicle(@PathVariable(name="id") Long pk , Model model)
	{
		vehicleService.deleteVehicle(pk);
		return "redirect:/ins/vehicle";
	}

}

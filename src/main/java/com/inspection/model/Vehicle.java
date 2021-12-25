package com.inspection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_INSP_VEHICLE")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="VEHICLE_ID")
	private Long vehicleId ; 
	@Column(name="CHASS_NO")
	private String chassNo ;
	@Column(name="BRAND")
	private String brand ; 
	@Column(name="MODEL")
	private String model ; 
	@Column(name="MODEL_YEAR")
	private String modelYear ;
	public Long getVehicleId() {
		return vehicleId;
	}
	public String getChassNo() {
		return chassNo;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public void setChassNo(String chassNo) {
		this.chassNo = chassNo;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", chassNo=" + chassNo + ", brand=" + brand + ", model=" + model
				+ ", modelYear=" + modelYear + "]";
	}
	
	

	
}

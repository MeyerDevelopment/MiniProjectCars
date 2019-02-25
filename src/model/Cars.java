package model;

import java.util.Date;

public class Cars {

	private int carID;
	private String make;
	private String model;
	private String year;
	private String color;
	private Date manufactureDate;
	
	//default constructor
	public Cars() {
		super();
	}
	
	//getters and setters
	private int getCarID() {
		return this.carID;
	}
	
	private void setID(int carID) {
		this.carID = carID;
	}
	
	private String getCarMake() {
		return this.make;
	}
	
	private void setCarMake(String make) {
		this.make = make;
	}
	
	
}

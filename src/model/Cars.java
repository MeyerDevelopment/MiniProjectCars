package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")

public class Cars {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "carID")
	private int carID;
	@Column(name="MAKE")
	private String make;
	@Column(name="MODEL")
	private String model;
	@Column(name="YEAR")
	private String year;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "ManufactureDate")
	private Date manufactureDate;
	
	//default constructor
	public Cars() {
		super();
	}
	
	//full variable constructor
	public Cars(String make, String model, String year, String color, Date manufactureDate) {
		this.make=make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.manufactureDate = manufactureDate;
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
	
	private String getCarModel() {
		return this.model;
	}
	
	private void setCarModel() {
		this.model = model;
	}
	
	private String getCarYear() {
		return this.year;
	}
	
	private void setCarYear(String year) {
		this.year = year;
	}
	
	private String getCarColor() {
		return this.color;
	}
	
	private void setCarColor(String color) {
		this.color = color;
	}
	
}

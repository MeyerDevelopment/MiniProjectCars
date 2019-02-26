package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cars")


public class Cars {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="carID")
	private int carID;
	@Column(name="MAKE")
	private String make;
	@Column(name="MODEL")
	private String model;
	@Column(name="YEAR")
	private String year;
	@Column(name="COLOR")
	private String color;
	@Column(name="ManufactureDate")
	private Date manufactureDate;
	
	//default constructor
	public Cars() {
		super();
	}
	
	public Cars(String make, String model, String year, String color, Date manufactureDate) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.manufactureDate = manufactureDate;
	}
	
	//getters and setters
	private int getCarID() {
		return this.carID;
	}
	
	private void setCarID(int carID) {
		this.carID = carID;
	}
	
	private String getMake() {
		return this.make;
	}
	
	private void setMake(String make) {
		this.make = make;
	}
	
	private void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}

	private String getYear() {
		return year;
	}

	private void setYear(String year) {
		this.year = year;
	}

	private String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	private Date getManufactureDate() {
		return manufactureDate;
	}

	private void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	//to String
	@Override
	public String toString() {
		return "Cars [carID=" + carID + ", make=" + make + ", model=" + model + ", year=" + year + ", color=" + color
				+ ", manufactureDate=" + manufactureDate + "]";
	}
}

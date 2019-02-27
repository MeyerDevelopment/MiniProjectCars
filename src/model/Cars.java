package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
	@Column(name = "COLOR")
	private String color;
	@Column(name="ManufactureDate")
	@Temporal(TemporalType.DATE)
	private Date manufactureDate;
	
	//default constructor
	public Cars() {
		super();
	}
	
	//full variable constructor
	public Cars(String make, String model, String year, String color, Date manufactureDate) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.manufactureDate = manufactureDate;
	}
	
	//getters and setters
	public int getCarID() {
		return this.carID;
	}
	
	public void setCarID(int carID) {
		this.carID = carID;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	private String getCarModel() {
		return this.model;
	}
	
	private void setCarModel(String model) {
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
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	//to String
	@Override
	public String toString() {
		return "Cars [carID=" + carID + ", make=" + make + ", model=" + model + ", year=" + year + ", color=" + color
				+ ", manufactureDate=" + manufactureDate + "]";
	}
}

package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="car_owner")

public class CarOwner {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ownerID")
	private int ownerID;
	@Column(name="OwnerName")
	private String ownerName;
	@Column(name="PhoneNumber")
	private String phoneNumber;
	@Column(name="PurchaseDate")
	private Date purchaseDate;
	@Column(name="carID")
	private int CarID;
	
	//constructors
	public CarOwner() {
		super();
	}
	
	public CarOwner(String ownerName,String phoneNumber, Date purchaseDate, int carID) {
		this.ownerName = ownerName;
		this.phoneNumber = phoneNumber;
		this.purchaseDate = purchaseDate;
		this.CarID = carID;
	}
	
	//getters and setters
	private int getOwnerID() {
		return ownerID;
	}
	private void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	private String getOwnerName() {
		return ownerName;
	}
	private void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	private String getPhoneNumber() {
		return phoneNumber;
	}
	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private Date getPurchaseDate() {
		return purchaseDate;
	}
	private void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	private int getCarID() {
		return CarID;
	}
	private void setCarID(int carID) {
		CarID = carID;
	}
	//To String
	@Override
	public String toString() {
		return "CarOwner [ownerID=" + ownerID + ", ownerName=" + ownerName + ", phoneNumber=" + phoneNumber
				+ ", purchaseDate=" + purchaseDate + ", CarID=" + CarID + "]";
	}
	
	
}

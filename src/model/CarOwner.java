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
	@Temporal(TemporalType.DATE)
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
	
	public CarOwner(String ownerName, String phoneNumber, Date purchaseDate) {
		this.ownerName = ownerName;
		this.phoneNumber = phoneNumber;
		this.purchaseDate = purchaseDate;
	}
	
	//getters and setters
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getCarID() {
		return CarID;
	}
	public void setCarID(int carID) {
		CarID = carID;
	}
	//To String
	@Override
	public String toString() {
		return "CarOwner [ownerID=" + ownerID + ", ownerName=" + ownerName + ", phoneNumber=" + phoneNumber
				+ ", purchaseDate=" + purchaseDate + ", CarID=" + CarID + "]";
	}
	
	
}

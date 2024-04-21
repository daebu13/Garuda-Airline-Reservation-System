package com.garuda.flightDetails.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FlightDetailsModel {

	@Id
	@GeneratedValue
	private int id;
	private int seats;
	private String departureCity;
	private String arrivalCity;
	
	
	public FlightDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightDetailsModel(int id, int seats, String departureCity,
			String arrivalCity) {
		super();
		this.id = id;
		this.seats = seats;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getseats() {
		return seats;
	}
	public void setseats(int seats) {
		this.seats = seats;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
}

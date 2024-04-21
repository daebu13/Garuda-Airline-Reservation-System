package com.garuda.flightDetails.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garuda.flightDetails.models.FlightDetailsModel;
import com.garuda.flightDetails.repository.FlightDetailsRepository;

@Service
public class  FlightDetailsService {
	
	@Autowired
	FlightDetailsRepository flightDetailsRepository;

	public FlightDetailsModel saveFlightDetails(FlightDetailsModel flightDetailsModel) {
		
		return flightDetailsRepository.save(flightDetailsModel);
	}


	public List<FlightDetailsModel> getAllFlightDetails() {
		// TODO Auto-generated method stub
		return (List<FlightDetailsModel>) flightDetailsRepository.findAll();
	}


	public List<FlightDetailsModel> getFlightDetails(String departureCity, String arrivalCity) {
		
		return (List<FlightDetailsModel>) flightDetailsRepository.findByDepartureCityAndArrivalCity(departureCity, arrivalCity);
	}


	public FlightDetailsModel updateFlightDetails(FlightDetailsModel flightDetailsModel) {
		
		return flightDetailsRepository.save(flightDetailsModel);
	}


	public void deleteFlightDetailsById(int id) {
		flightDetailsRepository.deleteById(id);
	}


	public FlightDetailsModel getFlightDetailsById(int id) 
	{
		return flightDetailsRepository.findById(id).get();
	}

}

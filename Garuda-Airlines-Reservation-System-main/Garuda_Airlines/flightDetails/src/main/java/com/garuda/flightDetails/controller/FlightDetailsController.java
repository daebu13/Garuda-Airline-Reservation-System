package com.garuda.flightDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.garuda.flightDetails.models.FlightDetailsModel;
import com.garuda.flightDetails.service.FlightDetailsService;

@RestController
@RequestMapping("/api")
public class FlightDetailsController {
	
	@Autowired
	FlightDetailsService flightDetailsService;

	@PostMapping("/save/_flightDetails")
	public FlightDetailsModel saveFlightDetails(@RequestBody FlightDetailsModel flightDetailsModel) {
		FlightDetailsModel fligDetails = flightDetailsService.saveFlightDetails(flightDetailsModel);
		return fligDetails;
	}
	@GetMapping("/_getflightDetailsById/{id}")
	public FlightDetailsModel getflightDetailsById(@PathVariable int id) {
	    return  flightDetailsService.getFlightDetailsById(id);
	    
	}
	
	@GetMapping("/_getAllFlightDetails")
	public List<FlightDetailsModel> getAllFlightDetails() {
		List<FlightDetailsModel> fligDetails=  flightDetailsService.getAllFlightDetails();
		return fligDetails;
	}
	
	@GetMapping("/_getFlightDetails/{departureCity}/{arrivalCity}")
	public List<FlightDetailsModel> getFlightDetails(@PathVariable String departureCity, @PathVariable String arrivalCity) {
		List<FlightDetailsModel> fligDetails=  flightDetailsService.getFlightDetails(departureCity,  arrivalCity);
		return fligDetails;
	}
	
	
	
}

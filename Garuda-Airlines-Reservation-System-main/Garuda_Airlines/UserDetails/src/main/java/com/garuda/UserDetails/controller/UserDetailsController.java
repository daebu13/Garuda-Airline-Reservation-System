package com.garuda.UserDetails.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garuda.UserDetails.models.UserDetailsModel;
import com.garuda.UserDetails.service.UserDetailsService;

@RestController
@RequestMapping("/api")
public class UserDetailsController {
 
	@Autowired
	UserDetailsService userDetailsService;
	
	@PostMapping("/save/_UserDetails")
	public UserDetailsModel saveUserDetails(@RequestBody UserDetailsModel UserDetailsModel) {
		UserDetailsModel UserDetails = userDetailsService.saveUserDetails(UserDetailsModel);
		return UserDetails;
	}
	
	@GetMapping("/_getAllUsertDetails")
	public List<UserDetailsModel> getAllFlightDetails() {
		List<UserDetailsModel> UserDetails=  userDetailsService.getAllUserDetails();
		return UserDetails;
	}
	
	@GetMapping("/_getUserDetailsById/{id}")
	public UserDetailsModel getUserDetailsById(@PathVariable int id) {
	UserDetailsModel UserDetails = userDetailsService.getUserDetailsById(id);
	return UserDetails;
	}
	
	@GetMapping("/_getUserDetails/{firstName}/{lastName}")
	public List<UserDetailsModel> getFlightDetails(@PathVariable String firstName, @PathVariable String lastName) {
		List<UserDetailsModel> UserDetails=  userDetailsService.getUserDetails(firstName,  lastName);
		return UserDetails;
	}
	@PutMapping("/_updateUserDetails")
	public UserDetailsModel updateFlightDetails(@RequestBody UserDetailsModel flightDetailsModel) {
		UserDetailsModel UserDetails = userDetailsService.updateUserDetails(flightDetailsModel);
		return UserDetails;
	}
}

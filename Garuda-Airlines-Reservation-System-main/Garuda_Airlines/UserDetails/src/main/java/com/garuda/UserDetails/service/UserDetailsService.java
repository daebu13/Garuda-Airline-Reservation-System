package com.garuda.UserDetails.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garuda.UserDetails.models.UserDetailsModel;
import com.garuda.UserDetails.repository.UserDetailsRepository;


@Service
public class UserDetailsService {

	@Autowired
	UserDetailsRepository userDetailsRepository;

	public UserDetailsModel saveUserDetails(UserDetailsModel userDetailsModel) {
		
		return userDetailsRepository.save(userDetailsModel);
	}


	public List<UserDetailsModel> getAllUserDetails() {
		// TODO Auto-generated method stub
		return (List<UserDetailsModel>) userDetailsRepository.findAll();
	}


	public List<UserDetailsModel> getUserDetails(String firstName, String lastName) {
		
		return (List<UserDetailsModel>) userDetailsRepository.findByFirstNameAndLastName(firstName, lastName);
	}


	public UserDetailsModel updateUserDetails(UserDetailsModel userDetailsModel) {
		
		return userDetailsRepository.save(userDetailsModel);
	}
    
	public UserDetailsModel getUserDetailsById(int id) {

		return userDetailsRepository.findById(id);
		}

	public void deleteUserDetailsById(int id) {
		userDetailsRepository.deleteById(id);
	}
}

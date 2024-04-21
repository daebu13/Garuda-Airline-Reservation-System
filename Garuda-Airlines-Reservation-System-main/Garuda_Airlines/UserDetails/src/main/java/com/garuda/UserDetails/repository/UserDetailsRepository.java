package com.garuda.UserDetails.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.garuda.UserDetails.models.UserDetailsModel;


@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetailsModel, Integer> {



	List<UserDetailsModel> findByFirstNameAndLastName(String firstName, String lastName);
	
	UserDetailsModel findById(int id);
}

package com.garuda.flightDetails.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.garuda.flightDetails.models.FlightDetailsModel;

@Repository
public interface FlightDetailsRepository extends CrudRepository<FlightDetailsModel, Integer> {


	List<FlightDetailsModel> findByDepartureCityAndArrivalCity(String departureCity, String arrivalCity);
}


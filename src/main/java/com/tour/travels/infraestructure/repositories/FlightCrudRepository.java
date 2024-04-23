package com.tour.travels.infraestructure.repositories;

import com.tour.travels.infraestructure.entities.Flight;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightCrudRepository extends CrudRepository<Flight, Integer>{
    List<Flight> findByOriginAndDestination(String origin, String destination);
}

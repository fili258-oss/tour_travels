package com.tour.travels.domain.service;

import com.tour.travels.domain.dto.FlightDTO;
import com.tour.travels.domain.repository.FlightRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    private FlightRepositoryDomain flightRepositoryDomain;

    public List<FlightDTO> getAll(){
        return flightRepositoryDomain.getAll();
    }

    public List<FlightDTO> getByOriginAndDestination(String origin, String destination){
        return flightRepositoryDomain.getByOriginAndDestination(origin, destination);
    }

    public Optional<FlightDTO> getById(Integer idFlightDTO){
        return flightRepositoryDomain.getById(idFlightDTO);
    }

    public FlightDTO save(FlightDTO flightDTO){
        return flightRepositoryDomain.save(flightDTO);
    }

}

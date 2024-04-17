package com.tour.travels.domain.repository;

import com.tour.travels.domain.dto.FlightDTO;

import java.util.List;
import java.util.Optional;

public interface FlightRepositoryDomain {

    List<FlightDTO> getAll();
    List<FlightDTO> getByOriginAndDestination(String origin, String destination);
    Optional<FlightDTO> getById(Integer idFlightDTO);
    FlightDTO save(FlightDTO flightDTO);

}

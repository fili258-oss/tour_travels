package com.tour.travels.infraestructure;

import com.tour.travels.domain.dto.FlightDTO;
import com.tour.travels.domain.repository.FlightRepositoryDomain;
import com.tour.travels.infraestructure.entities.Flight;
import com.tour.travels.infraestructure.mapper.FlightMapper;
import com.tour.travels.infraestructure.repositories.FlightCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FlightRepository implements FlightRepositoryDomain{

    @Autowired
    private FlightCrudRepository flightCrudRepository;

    @Autowired
    private FlightMapper flightMapper;

    @Override
    public List<FlightDTO> getAll() {
        List<Flight> flights = (List<Flight>) flightCrudRepository.findAll();
        return flightMapper.toFlightsDTO(flights);
    }

    @Override
    public List<FlightDTO> getByOriginAndDestination(String origin, String destination) {
        List<Flight> flights = flightCrudRepository.findByOriginAndDestination(origin, destination);
        return flightMapper.toFlightsDTO(flights);
    }

    @Override
    public Optional<FlightDTO> getById(Integer idFlightDTO) {
        Optional<Flight> flight = flightCrudRepository.findById(idFlightDTO);
        return flightMapper.toFlightDTOOptional(flight);
    }

    @Override
    public FlightDTO save(FlightDTO flightDTO) {
        Flight flight = flightMapper.toFlight(flightDTO);
        return flightMapper.toFlightDTO(flightCrudRepository.save(flight));
    }

}

package com.tour.travels.infraestructure.mapper;

import com.tour.travels.domain.dto.FlightDTO;
import com.tour.travels.infraestructure.entities.Flight;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface FlightMapper {

    @Mappings({

        @Mapping(source = "id", target ="id"),
        @Mapping(source = "takeOff", target ="takeOff"),
        @Mapping(source = "touchDown", target ="touchDown"),
        @Mapping(source = "origin", target ="origin"),
        @Mapping(source = "destination", target ="destination"),
        @Mapping(source = "idPlane", target ="idPlane")

    })

    FlightDTO toFlightDTO(Flight flight);

    List<FlightDTO> toFlightsDTO(List<Flight> flight);

    default Optional<FlightDTO> toFlightDTOOptional(Optional<Flight> flight){
        return flight.map(this::toFlightDTO);
    }

    @InheritInverseConfiguration
    Flight toFlight(FlightDTO flightDTO);

}

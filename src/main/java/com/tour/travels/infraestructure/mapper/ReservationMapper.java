package com.tour.travels.infraestructure.mapper;

import com.tour.travels.domain.dto.ReservationDTO;
import com.tour.travels.infraestructure.entities.Reservation;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    @Mappings({

        @Mapping(source = "id", target ="id"),
        @Mapping(source = "active", target ="active"),
        @Mapping(source = "paid", target ="paid"),
        @Mapping(source = "idUser", target ="idUser"),
        @Mapping(source = "idFlight", target ="idFlight")

    })

    ReservationDTO toReservationDTO(Reservation reservation);

    List<ReservationDTO> toReservationsDTO(List<Reservation> reservation);

    default Optional<ReservationDTO> toReservationDTOOptional(Optional<Reservation> reservation){
        return reservation.map(this::toReservationDTO);
    }

    @InheritInverseConfiguration
    Reservation toReservation(ReservationDTO reservationDTO);

}

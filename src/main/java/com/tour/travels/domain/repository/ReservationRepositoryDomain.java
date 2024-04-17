package com.tour.travels.domain.repository;

import com.tour.travels.domain.dto.ReservationDTO;

import java.util.List;
import java.util.Optional;

public interface ReservationRepositoryDomain {

    List<ReservationDTO> getAll();
    List<ReservationDTO> getByIdUser(Integer idUser);
    Optional<ReservationDTO> getById(Integer idReservationDTO);
    ReservationDTO save(ReservationDTO reservationDTO);

}

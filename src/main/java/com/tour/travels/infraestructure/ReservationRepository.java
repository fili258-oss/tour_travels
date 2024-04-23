package com.tour.travels.infraestructure;

import com.tour.travels.domain.dto.ReservationDTO;
import com.tour.travels.domain.repository.ReservationRepositoryDomain;
import com.tour.travels.infraestructure.entities.Reservation;
import com.tour.travels.infraestructure.mapper.ReservationMapper;
import com.tour.travels.infraestructure.repositories.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository implements ReservationRepositoryDomain {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    @Autowired
    private ReservationMapper reservationMapper;

    @Override
    public List<ReservationDTO> getAll() {
        List<Reservation> reservations = (List<Reservation>) reservationCrudRepository.findAll();
        return reservationMapper.toReservationsDTO(reservations);
    }

    @Override
    public List<ReservationDTO> getByIdUser(Integer idUser) {
        List<Reservation> reservations = reservationCrudRepository.findByIdUser(idUser);
        return reservationMapper.toReservationsDTO(reservations);
    }

    @Override
    public Optional<ReservationDTO> getById(Integer idReservationDTO) {
        Optional<Reservation> reservation = reservationCrudRepository.findById(idReservationDTO);
        return reservationMapper.toReservationDTOOptional(reservation);
    }

    @Override
    public ReservationDTO save(ReservationDTO reservationDTO) {
        Reservation reservation = reservationMapper.toReservation(reservationDTO);
        return reservationMapper.toReservationDTO(reservationCrudRepository.save(reservation));
    }

}

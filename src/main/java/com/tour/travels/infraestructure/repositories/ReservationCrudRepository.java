package com.tour.travels.infraestructure.repositories;

import com.tour.travels.infraestructure.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
    List<Reservation> findByIdUser(Integer idUser);
}

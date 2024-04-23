package com.tour.travels.infraestructure.repositories;

import com.tour.travels.infraestructure.entities.Plane;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlaneCrudRepository extends CrudRepository<Plane, Integer>{
    List<Plane> findByIdReservation(Integer idReservation);
}

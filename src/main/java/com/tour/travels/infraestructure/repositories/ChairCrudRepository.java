package com.tour.travels.infraestructure.repositories;

import com.tour.travels.infraestructure.entities.Chair;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChairCrudRepository extends CrudRepository<Chair, Integer> {
    List<Chair> findByIdFlight(Integer idFlight);
}

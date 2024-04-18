package com.tour.travels.domain.repository;

import com.tour.travels.domain.dto.PlaneDTO;

import java.util.List;
import java.util.Optional;

public interface PlaneRepositoryDomain {

    List<PlaneDTO> getAll();

    Optional<PlaneDTO> getById(Integer idPlaneDTO);
    PlaneDTO save(PlaneDTO planeDTO);

}

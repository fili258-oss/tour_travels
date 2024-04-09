package com.tour.travels.domain.repository;

import com.tour.travels.domain.dto.ChairDTO;

import java.util.List;
import java.util.Optional;

public interface ChairRepositoryDomain {

    List<ChairDTO> getAll();
    List<ChairDTO> getByIdFlight(Integer idFlight);
    Optional<ChairDTO> getById(Integer idChairDTO);
    ChairDTO save(ChairDTO ChairDTO);
    void delete(Integer idChairDTO);
    
}

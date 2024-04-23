package com.tour.travels.domain.service;

import com.tour.travels.domain.dto.PlaneDTO;
import com.tour.travels.domain.repository.PlaneRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaneService {

    @Autowired
    private PlaneRepositoryDomain planeRepo;

    public List<PlaneDTO> getAll(){
        return planeRepo.getAll();
    }

    public Optional<PlaneDTO> getById(Integer idPlaneDTO){
        return planeRepo.getById(idPlaneDTO);
    }

    public PlaneDTO save(PlaneDTO planeDTO){
        return planeRepo.save(planeDTO);
    }

}

package com.tour.travels.domain.service;

import com.tour.travels.domain.dto.ChairDTO;
import com.tour.travels.domain.repository.ChairRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChairService {

    @Autowired
    private ChairRepositoryDomain chairRepositoryDomain;

    public List<ChairDTO> getAll(){
        return chairRepositoryDomain.getAll();
    }

    public Optional<ChairDTO> getById(Integer idChairDTO){
        return chairRepositoryDomain.getById(idChairDTO);
    }

    public ChairDTO save(ChairDTO chairDTO){
        return chairRepositoryDomain.save(chairDTO);
    }

}

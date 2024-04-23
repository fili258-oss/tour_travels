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
    private ChairRepositoryDomain chairRepo;

    public List<ChairDTO> getAll(){
        return chairRepo.getAll();
    }

    public Optional<ChairDTO> getByID(Integer chairDTOID){
        return chairRepo.getById(chairDTOID);
    }

    public ChairDTO save(ChairDTO chairDTO){
        return chairRepo.save(chairDTO);
    }

    public boolean delete(Integer chairDTOID){
        if(getByID(chairDTOID).isPresent()){
            chairRepo.delete(chairDTOID);
            return true;
        }
        return false;
    }
    
}

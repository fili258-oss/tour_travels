package com.tour.travels.infraestructure;

import com.tour.travels.domain.dto.ChairDTO;
import com.tour.travels.domain.repository.ChairRepositoryDomain;
import com.tour.travels.infraestructure.entities.Chair;
import com.tour.travels.infraestructure.mapper.ChairMapper;
import com.tour.travels.infraestructure.repositories.ChairCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ChairRepository implements ChairRepositoryDomain {
    @Autowired
    private ChairCrudRepository chairRepo;
    
    @Autowired
    private ChairMapper mapper;

    @Override
    public List<ChairDTO> getAll() {
        List<Chair> chairs = (List<Chair>) chairRepo.findAll();
        return mapper.toChairsDTO(chairs);
    }

    @Override
    public List<ChairDTO> getByIdFlight(Integer idFlight) {
        List<Chair> chairs = chairRepo.findByIdFlight(idFlight);
        return mapper.toChairsDTO(chairs);
    }

    @Override
    public Optional<ChairDTO> getById(Integer idChairDTO) {
        Optional<Chair> chair = chairRepo.findById(idChairDTO);
        return mapper.toChairDTOOptional(chair);
    }

    @Override
    public ChairDTO save(ChairDTO chairDTO) {
        Chair chair = mapper.toChair(chairDTO);
        return mapper.toChairDTO(chairRepo.save(chair));
    }

    @Override
    public void delete(Integer idChairDTO) {
        chairRepo.deleteById(idChairDTO);
    }
}

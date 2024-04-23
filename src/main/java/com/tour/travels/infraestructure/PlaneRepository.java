package com.tour.travels.infraestructure;

import com.tour.travels.domain.dto.PlaneDTO;
import com.tour.travels.domain.repository.PlaneRepositoryDomain;
import com.tour.travels.infraestructure.entities.Plane;
import com.tour.travels.infraestructure.mapper.PlaneMapper;
import com.tour.travels.infraestructure.repositories.PlaneCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PlaneRepository implements PlaneRepositoryDomain{

    @Autowired
    private PlaneCrudRepository planeRepo;

    @Autowired
    private PlaneMapper mapper;

    @Override
    public List<PlaneDTO> getAll() {
        List<Plane> planes = (List<Plane>) planeRepo.findAll();
        return mapper.toPlanesDTO(planes);
    }


    @Override
    public Optional<PlaneDTO> getById(Integer idPlaneDTO) {
        Optional<Plane> plane = planeRepo.findById(idPlaneDTO);
        return mapper.toPlaneDTOOptional(plane);
    }

    @Override
    public PlaneDTO save(PlaneDTO planeDTO) {
        Plane plane = mapper.toPlane(planeDTO);
        return mapper.toPlaneDTO(planeRepo.save(plane));
    }

}

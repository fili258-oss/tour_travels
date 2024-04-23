package com.tour.travels.domain.service;

import com.tour.travels.domain.dto.ReservationDTO;
import com.tour.travels.domain.repository.ReservationRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepositoryDomain reservationRepositoryDomain;

    public List<ReservationDTO> getAll(){
        return reservationRepositoryDomain.getAll();
    }

    public List<ReservationDTO> getByIdUser(Integer idUser){
        return reservationRepositoryDomain.getByIdUser(idUser);
    }

    public Optional<ReservationDTO> getById(Integer idReservationDTO){
        return reservationRepositoryDomain.getById(idReservationDTO);
    }

    public ReservationDTO save (@RequestBody ReservationDTO reservationDTO){return reservationRepositoryDomain.save(reservationDTO);}

}

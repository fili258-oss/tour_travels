package com.tour.travels.application.controller;

import com.tour.travels.domain.dto.ReservationDTO;
import com.tour.travels.domain.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public List<ReservationDTO> getAll(){
        return reservationService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<ReservationDTO> getById(@PathVariable("id") Integer idReservationDTO){
        return reservationService.getById(idReservationDTO)
        .map(reservationDTO -> new ResponseEntity<>(reservationDTO, HttpStatus.OK))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    public ReservationDTO save(@RequestBody ReservationDTO reservationDTO){
        return reservationService.save(reservationDTO);
    }

}

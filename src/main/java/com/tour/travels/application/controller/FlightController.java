package com.tour.travels.application.controller;

import com.tour.travels.domain.dto.FlightDTO;
import com.tour.travels.domain.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fligths")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<FlightDTO> getAll(){
        return flightService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<FlightDTO> getById(@PathVariable("id") Integer idFlightDTO){
        return flightService.getById(idFlightDTO)
        .map(flightDTO -> new ResponseEntity<>(flightDTO, HttpStatus.OK))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    public FlightDTO save(@RequestBody FlightDTO flightDTO){
        return flightService.save(flightDTO);
    }

}

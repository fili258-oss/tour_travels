package com.tour.travels.application.controller;

import com.tour.travels.domain.dto.PlaneDTO;
import com.tour.travels.domain.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlaneController {

    @Autowired
    private PlaneService planeService;

    @GetMapping
    public List<PlaneDTO> getAll(){
        return planeService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<PlaneDTO> getById(@PathVariable("id") Integer idPlaneDTO){
        return planeService.getById(idPlaneDTO)
        .map(planeDTO -> new ResponseEntity<>(planeDTO, HttpStatus.OK))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    public PlaneDTO save(@RequestBody PlaneDTO planeDTO){
        return planeService.save(planeDTO);
    }

}

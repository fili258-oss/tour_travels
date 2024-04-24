package com.tour.travels.application.controller;

import com.tour.travels.domain.dto.ChairDTO;
import com.tour.travels.domain.service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chairs")
public class ChairController {

    @Autowired
    private ChairService chairService;

    @GetMapping
    public List<ChairDTO> getAll(){
        return chairService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<ChairDTO> getById(@PathVariable("id") Integer idChairDTO){
        return chairService.getById(idChairDTO)
        .map(chairDTO -> new ResponseEntity<>(chairDTO, HttpStatus.OK))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    public ChairDTO save(@RequestBody ChairDTO chairDTO){
        return chairService.save(chairDTO);
    }

}

package com.challenge.assessment.reclamo.controller;

import com.challenge.assessment.reclamo.entity.Reclamo;
import com.challenge.assessment.reclamo.service.impl.ReclamoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/v1")
public class ReclamoController {

    @Autowired
    private ReclamoServiceImpl reclamoService;

    @RequestMapping(value = "/reclamo", method = RequestMethod.POST)
    public ResponseEntity<Reclamo> guardarReclamo(@RequestBody Reclamo request){

        Reclamo reclamo = new Reclamo();

        reclamo = reclamoService.save(request);

        return new ResponseEntity<>(reclamo, HttpStatus.OK);

    }

    @RequestMapping(value = "/reclamo", method = RequestMethod.GET)
    public ResponseEntity<List<Reclamo>> guardarReclamo(){

        List<Reclamo> reclamoList = new ArrayList<>();

        reclamoList = reclamoService.findAll();

        return new ResponseEntity<>(reclamoList, HttpStatus.OK);

    }











}

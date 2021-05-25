package com.challenge.assessment.reclamo.service;

import com.challenge.assessment.reclamo.entity.Reclamo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReclamoService {

    Reclamo save(Reclamo reclamo);
    List<Reclamo> findAll();
    void findDeleteAll();

}

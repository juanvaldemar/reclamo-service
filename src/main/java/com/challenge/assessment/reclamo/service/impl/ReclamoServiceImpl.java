package com.challenge.assessment.reclamo.service.impl;

import com.challenge.assessment.reclamo.entity.Reclamo;
import com.challenge.assessment.reclamo.repository.ReclamoServiceRepositoy;
import com.challenge.assessment.reclamo.service.ReclamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamoServiceImpl implements ReclamoService {

    @Autowired
    private ReclamoServiceRepositoy reclamoServiceRepositoy;

    @Override
    public Reclamo save(Reclamo reclamo) {
        return reclamoServiceRepositoy.save(reclamo);

    }

    @Override
    public List<Reclamo> findAll() {
        return reclamoServiceRepositoy.findAll();
    }

    @Override
    public void findDeleteAll() {
        reclamoServiceRepositoy.deleteAll();
    }

    @Override
    public List<Reclamo> findAllByCod(String id) {
        return reclamoServiceRepositoy.findAllByCod(id);

    }

}

package com.edu.uptc.hospital.services;

import com.edu.uptc.hospital.entities.FacturaModel;
import com.edu.uptc.hospital.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public List<FacturaModel> findAll() {
        return facturaRepository.findAll();
    }

    public FacturaModel findById(Long id) {
        return facturaRepository.findById(id).orElse(null);
    }

    public FacturaModel save(FacturaModel facturaModel) {
        return facturaRepository.save(facturaModel);
    }

    public FacturaModel delete(long id) {
        FacturaModel facturaModel = findById(id);
        facturaRepository.delete(facturaModel);
        return facturaModel;
    }

    public FacturaModel update(FacturaModel facturaModel) {
        return facturaRepository.save(facturaModel);
    }

}

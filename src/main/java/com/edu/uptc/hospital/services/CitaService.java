package com.edu.uptc.hospital.services;

import com.edu.uptc.hospital.entities.CitaModel;
import com.edu.uptc.hospital.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public List<CitaModel> findAll(){
        return citaRepository.findAll();
    }

    public CitaModel findById(long id){
        return citaRepository.findById(id).orElse(null);
    }

    public CitaModel save(CitaModel citaModel){
        return citaRepository.save(citaModel);
    }

    public CitaModel delete(long id){
        CitaModel citaModel = findById(id);
        citaRepository.delete(citaModel);
        return citaModel;
    }

    public CitaModel update(CitaModel citaModel){
        return citaRepository.save(citaModel);
    }

}

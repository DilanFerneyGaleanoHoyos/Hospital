package com.edu.uptc.hospital.services;

import com.edu.uptc.hospital.entities.PacienteModel;
import com.edu.uptc.hospital.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<PacienteModel> findAll() {
        return pacienteRepository.findAll();
    }

    public PacienteModel findById(long id) {
        return pacienteRepository.findById(id).orElse(null);
    }

    public PacienteModel save(PacienteModel pacienteModel) {
        return pacienteRepository.save(pacienteModel);
    }

    public PacienteModel delete(long id) {
        PacienteModel pacienteModel = findById(id);
        pacienteRepository.delete(pacienteModel);
        return pacienteModel;
    }

    public PacienteModel update(PacienteModel pacienteModel) {
        return pacienteRepository.save(pacienteModel);
    }

}

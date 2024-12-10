package com.edu.uptc.hospital.services;

import com.edu.uptc.hospital.entities.HistoriaClinicaModel;
import com.edu.uptc.hospital.repositories.HistoriaClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriaClinicaService {

    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    public List<HistoriaClinicaModel> findAll() {
        return historiaClinicaRepository.findAll();
    }

    public HistoriaClinicaModel findById(Long id) {
        return historiaClinicaRepository.findById(id).orElse(null);
    }

    public HistoriaClinicaModel save(HistoriaClinicaModel historiaClinicaModel) {
        return historiaClinicaRepository.save(historiaClinicaModel);
    }

    public HistoriaClinicaModel delete(long id) {
        HistoriaClinicaModel historiaClinicaModel = findById(id);
        historiaClinicaRepository.delete(historiaClinicaModel);
        return historiaClinicaModel;
    }

    public HistoriaClinicaModel update(HistoriaClinicaModel historiaClinicaModel) {
        return historiaClinicaRepository.save(historiaClinicaModel);
    }
    
      // Nuevo método
      public List<HistoriaClinicaModel> findByPacienteId(Long pacienteId) {
        return historiaClinicaRepository.findByPacienteId(pacienteId);
    }

}

package com.edu.uptc.hospital.repositories;

import com.edu.uptc.hospital.entities.HistoriaClinicaModel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinicaModel, Long> {
    List<HistoriaClinicaModel> findByPacienteId(Long pacienteId);
}

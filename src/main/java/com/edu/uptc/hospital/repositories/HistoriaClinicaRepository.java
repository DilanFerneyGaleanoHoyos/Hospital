package com.edu.uptc.hospital.repositories;

import com.edu.uptc.hospital.entities.HistoriaClinicaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinicaModel, Long> {
}

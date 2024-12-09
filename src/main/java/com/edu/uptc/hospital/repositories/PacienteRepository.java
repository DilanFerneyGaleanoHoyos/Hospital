package com.edu.uptc.hospital.repositories;

import com.edu.uptc.hospital.entities.PacienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteModel, Long> {
}

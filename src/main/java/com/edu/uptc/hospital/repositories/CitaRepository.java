package com.edu.uptc.hospital.repositories;

import com.edu.uptc.hospital.entities.CitaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<CitaModel, Long>{
}

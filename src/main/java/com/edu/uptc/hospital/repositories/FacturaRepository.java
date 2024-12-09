package com.edu.uptc.hospital.repositories;

import com.edu.uptc.hospital.entities.FacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaModel, Long> {
}

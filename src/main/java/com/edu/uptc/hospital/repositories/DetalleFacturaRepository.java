package com.edu.uptc.hospital.repositories;

import com.edu.uptc.hospital.entities.DetalleFacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleFacturaRepository extends JpaRepository<DetalleFacturaModel, Long> {
}

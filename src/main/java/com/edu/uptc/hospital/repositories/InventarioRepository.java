package com.edu.uptc.hospital.repositories;

import com.edu.uptc.hospital.entities.InventarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<InventarioModel, Long> {
}

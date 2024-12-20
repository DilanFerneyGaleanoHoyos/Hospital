package com.edu.uptc.hospital.repositories;

import com.edu.uptc.hospital.entities.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    UsuarioModel findByNombreUsuario(String nombreUsuario);
}

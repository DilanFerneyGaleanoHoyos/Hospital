package com.edu.uptc.hospital.services;

import com.edu.uptc.hospital.entities.InventarioModel;
import com.edu.uptc.hospital.repositories.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public List<InventarioModel> findAll() {
        return inventarioRepository.findAll();
    }

    public InventarioModel findById(long id) {
        return inventarioRepository.findById(id).orElse(null);
    }

    public InventarioModel save(InventarioModel inventarioModel) {
        return inventarioRepository.save(inventarioModel);
    }

    public InventarioModel delete(long id) {
        InventarioModel inventarioModel = findById(id);
        inventarioRepository.delete(inventarioModel);
        return inventarioModel;
    }

    public InventarioModel update(InventarioModel inventarioModel) {
        return inventarioRepository.save(inventarioModel);
    }

}

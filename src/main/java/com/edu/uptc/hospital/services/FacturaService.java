package com.edu.uptc.hospital.services;

import com.edu.uptc.hospital.entities.FacturaModel;
import com.edu.uptc.hospital.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    // Obtener todas las facturas
    public List<FacturaModel> findAll() {
        return facturaRepository.findAll();
    }

    // Obtener una factura por su ID
    public FacturaModel findById(Long id) {
        return facturaRepository.findById(id).orElse(null);
    }

    // Crear una nueva factura
    public FacturaModel save(FacturaModel facturaModel) {
        return facturaRepository.save(facturaModel);
    }

    // Eliminar una factura
    public FacturaModel delete(Long id) {
        FacturaModel facturaModel = findById(id);
        if (facturaModel != null) {
            facturaRepository.delete(facturaModel);
        }
        return facturaModel;
    }

    // Actualizar una factura
    public FacturaModel update(FacturaModel facturaModel) {
        return facturaRepository.save(facturaModel);
    }
}

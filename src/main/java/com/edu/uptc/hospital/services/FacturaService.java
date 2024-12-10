package com.edu.uptc.hospital.services;

import com.edu.uptc.hospital.entities.DetalleFacturaModel;
import com.edu.uptc.hospital.entities.FacturaModel;
import com.edu.uptc.hospital.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

     @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private DetalleFacturaService detalleFacturaService;

    public FacturaModel crearFactura(FacturaModel facturaModel) {
        // Guardamos la factura primero
        FacturaModel facturaGuardada = facturaRepository.save(facturaModel);

        // Asociamos cada detalle a la factura y lo guardamos
        for (DetalleFacturaModel detalle : facturaModel.getDetalles()) {
            detalle.setFactura(facturaGuardada);  // Asociamos la factura al detalle
            detalleFacturaService.guardarDetalle(detalle);  // Guardamos el detalle
        }

        return facturaGuardada;
    }
    public List<FacturaModel> findAll() {
        return facturaRepository.findAll();
    }

    public FacturaModel findById(Long id) {
        return facturaRepository.findById(id).orElse(null);
    }

    public FacturaModel save(FacturaModel facturaModel) {
        return facturaRepository.save(facturaModel);
    }

    public FacturaModel delete(long id) {
        FacturaModel facturaModel = findById(id);
        facturaRepository.delete(facturaModel);
        return facturaModel;
    }

    public FacturaModel update(FacturaModel facturaModel) {
        return facturaRepository.save(facturaModel);
    }

}

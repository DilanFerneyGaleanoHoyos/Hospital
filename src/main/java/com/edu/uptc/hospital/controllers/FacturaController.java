package com.edu.uptc.hospital.controllers;

import com.edu.uptc.hospital.entities.FacturaModel;
import com.edu.uptc.hospital.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    // Obtener todas las facturas
    @GetMapping
    public List<FacturaModel> findAll() {
        return facturaService.findAll();
    }

    // Obtener factura por ID
    @GetMapping("/{id}")
    public FacturaModel findById(@PathVariable Long id) {
        return facturaService.findById(id);
    }

    // Crear una nueva factura
    @PostMapping
    public FacturaModel save(@RequestBody FacturaModel facturaModel) {
        return facturaService.save(facturaModel);
    }

    // Eliminar una factura
    @DeleteMapping("/{id}")
    public FacturaModel delete(@PathVariable Long id) {
        return facturaService.delete(id);
    }

    // Actualizar una factura
    @PutMapping("/{id}")
    public FacturaModel update(@PathVariable Long id, @RequestBody FacturaModel facturaModel) {
        facturaModel.setId(id);
        return facturaService.update(facturaModel);
    }
}

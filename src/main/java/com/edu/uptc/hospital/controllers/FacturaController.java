package com.edu.uptc.hospital.controllers;

import com.edu.uptc.hospital.entities.DetalleFacturaModel;
import com.edu.uptc.hospital.entities.FacturaModel;
import com.edu.uptc.hospital.responses.ResponseHandler;
import com.edu.uptc.hospital.services.DetalleFacturaService;
import com.edu.uptc.hospital.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public ResponseEntity<Object> findAll() {
        try{
            List<FacturaModel> result = facturaService.findAll();
            return ResponseHandler.generateResponse("Success", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null );
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@RequestParam long id) {
        try{
            FacturaModel result = facturaService.findById(id);
            return ResponseHandler.generateResponse("Success", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null );
        }
    }

    @PostMapping
    public FacturaModel crearFactura(@RequestBody FacturaModel facturaModel) {
        return facturaService.crearFactura(facturaModel);
    }

    @Autowired
    private DetalleFacturaService detalleFacturaService;

    // Modificar el método save para que reciba tanto la factura como los detalles
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody FacturaModel factura) {
        try {
            // Guardar la factura
            FacturaModel savedFactura = facturaService.save(factura);

            // Ahora, agregamos los detalles de factura (si se proporcionan)
            if (factura.getDetalles() != null && !factura.getDetalles().isEmpty()) {
                for (DetalleFacturaModel detalle : factura.getDetalles()) {
                    detalle.setFactura(savedFactura);  // Asociar el detalle con la factura
                    detalleFacturaService.save(detalle);  // Guardar cada detalle
                }
            }

            return ResponseHandler.generateResponse("Factura y detalles guardados con éxito", HttpStatus.OK, savedFactura);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null );
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable long id) {
        try{
            FacturaModel result = facturaService.delete(id);
            return ResponseHandler.generateResponse("Success", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null );
        }
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody FacturaModel factura) {
        try{
            FacturaModel result = facturaService.update(factura);
            return ResponseHandler.generateResponse("Success", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null );
        }
    }

}

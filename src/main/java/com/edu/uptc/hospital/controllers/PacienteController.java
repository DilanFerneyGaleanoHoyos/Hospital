package com.edu.uptc.hospital.controllers;

import com.edu.uptc.hospital.entities.HistoriaClinicaModel;
import com.edu.uptc.hospital.entities.PacienteModel;
import com.edu.uptc.hospital.responses.ResponseHandler;
import com.edu.uptc.hospital.services.HistoriaClinicaService;
import com.edu.uptc.hospital.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private HistoriaClinicaService historiaClinicaService;
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<Object> findAll() {
        try{
            List<PacienteModel> result = pacienteService.findAll();
            return ResponseHandler.generateResponse("Success", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null );
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable long id) {
        try{
            PacienteModel result = pacienteService.findById(id);
            return ResponseHandler.generateResponse("Success", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null );
        }
    }

    @PostMapping()
    public ResponseEntity<Object> save(@RequestBody PacienteModel pacienteModel) {
        try{
            PacienteModel result = pacienteService.save(pacienteModel);
            return ResponseHandler.generateResponse("Success", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null );
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable long id) {
        try{
            PacienteModel result = pacienteService.delete(id);
            return ResponseHandler.generateResponse("Success", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null );
        }
    }

    @PutMapping()
    public ResponseEntity<Object> update(@RequestBody PacienteModel pacienteModel) {
        try{
            PacienteModel result = pacienteService.update(pacienteModel);
            return ResponseHandler.generateResponse("Success", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null );
        }
    }
 
}



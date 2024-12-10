package com.edu.uptc.hospital.services;

import com.edu.uptc.hospital.entities.DetalleFacturaModel;
import com.edu.uptc.hospital.repositories.DetalleFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleFacturaService {
    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;

    public void guardarDetalle(DetalleFacturaModel detalleFacturaModel) {
        detalleFacturaRepository.save(detalleFacturaModel);
    }

    public List<DetalleFacturaModel> findAll(){
        return detalleFacturaRepository.findAll();
    }

    public DetalleFacturaModel findById(long id){
        return detalleFacturaRepository.findById(id).orElse(null);
    }

    public DetalleFacturaModel save(DetalleFacturaModel detalleFacturaModel){
        return detalleFacturaRepository.save(detalleFacturaModel);
    }

    public DetalleFacturaModel delete(long id){
        DetalleFacturaModel detalleFacturaModel = findById(id);
        detalleFacturaRepository.delete(detalleFacturaModel);
        return detalleFacturaModel;
    }

    public DetalleFacturaModel update(DetalleFacturaModel detalleFacturaModel){
        return detalleFacturaRepository.save(detalleFacturaModel);
    }

}

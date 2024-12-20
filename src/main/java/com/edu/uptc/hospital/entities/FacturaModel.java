package com.edu.uptc.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Factura")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private PacienteModel paciente;

    @Column(nullable = false, updatable = false)
    private Date fechaEmision = new Date();

    @Column(nullable = false)
    private double total;

    @Column(nullable = false)
    private String servicio;  // Nueva columna para el servicio asociado
}

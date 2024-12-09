package com.edu.uptc.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "HISTORIA_CLINICA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoriaClinicaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private PacienteModel paciente;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false, updatable = false)
    private Date fechaCreacion = new Date();

}

package com.edu.uptc.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "CITA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CitaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private PacienteModel paciente;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private String motivo;

    @Column(nullable = false)
    private String estado = "pendiente";

}

package com.edu.uptc.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DETALLE_FACTURA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetalleFacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "factura_id", nullable = false)
    private FacturaModel factura;

    @ManyToOne
    @JoinColumn(name = "inventario_id", nullable = false)
    private InventarioModel inventario;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private double subtotal;

}

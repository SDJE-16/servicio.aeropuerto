package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name="vehiculo_aereo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class VehiculoAereo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="modelo")
    private String modelo;

    @OneToMany(mappedBy="vehiculoAereo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Vuelo> vuelos;

    public VehiculoAereo() {}

    // Getters y setters
}

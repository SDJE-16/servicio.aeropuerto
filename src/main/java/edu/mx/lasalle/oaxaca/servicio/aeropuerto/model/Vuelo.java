package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name="vuelo")
public class Vuelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(fetch= FetchType.EAGER, optional = false )
    @JoinColumn(name="id_tripulacion", nullable = false)
    private Tripulacion tripulacion;
    
    @ManyToOne(fetch= FetchType.EAGER, optional = false )
    @JoinColumn(name="id_vehiculo", nullable = false)
    private VehiculoAereo vehiculoAereo;
    
    @OneToMany(mappedBy="vuelo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Boleto> boletos;

    @ManyToOne(fetch= FetchType.EAGER, optional = false )
    @JoinColumn(name="id_terminal", nullable = false)
    private Terminal terminal;

    public Vuelo() {}

    // Getters y setters
}

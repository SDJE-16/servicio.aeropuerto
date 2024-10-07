package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name="tripulacion")
public class Tripulacion implements Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="identificacion")
    private String identificacion;
    
    @OneToMany(mappedBy="tripulacion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Vuelo> vuelos;
    
    public Tripulacion() {}
    
    public Tripulacion(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getIdentificacion() {
        return identificacion;
    }

    @Override
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Set<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(Set<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}

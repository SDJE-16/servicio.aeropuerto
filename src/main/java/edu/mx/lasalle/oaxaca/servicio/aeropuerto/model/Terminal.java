package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name="terminal")
public class Terminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_terminal")
    private int idTerminal;

    @Column(name="nombre")
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_aeropuerto", nullable = false)
    private Aeropuerto aeropuerto;

    @OneToMany(mappedBy="terminal", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Vuelo> vuelos;

    public Terminal() {}

    public Terminal(String nombre, Aeropuerto aeropuerto) {
        this.nombre = nombre;
        this.aeropuerto = aeropuerto;
    }

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        this.idTerminal = idTerminal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public Set<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(Set<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}

package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name="aeropuerto")
public class Aeropuerto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_aeropuerto")
    private int idAeropuerto;

    @Column(name="nombre")
    private String nombre;

    @Column(name="ubicacion")
    private String ubicacion;

    @OneToMany(mappedBy="aeropuerto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Terminal> terminales;

    public Aeropuerto() {}

    public Aeropuerto(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public int getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(int idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Set<Terminal> getTerminales() {
        return terminales;
    }

    public void setTerminales(Set<Terminal> terminales) {
        this.terminales = terminales;
    }
}

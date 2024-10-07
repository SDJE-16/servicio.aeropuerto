package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name="pasajero")
public class Pasajero implements Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="identificacion")
    private String identificacion;
    
    @OneToMany(mappedBy="pasajero", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Boleto> boletos;
    
    @OneToMany(mappedBy="pasajero", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Equipaje> equipajes;
    
    public Pasajero() {}

    public Pasajero(String nombre, String identificacion) {
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

    public Set<Boleto> getBoletos() {
        return boletos;
    }

    public void setBoletos(Set<Boleto> boletos) {
        this.boletos = boletos;
    }

    public Set<Equipaje> getEquipajes() {
        return equipajes;
    }

    public void setEquipajes(Set<Equipaje> equipajes) {
        this.equipajes = equipajes;
    }
}

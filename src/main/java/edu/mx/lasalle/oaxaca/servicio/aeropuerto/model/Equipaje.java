package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;

@Entity
@Table(name="equipaje")
public class Equipaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_equipaje")
    private int idEquipaje;

    @Column(name="peso")
    private double peso;

    @Column(name="descripcion")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_pasajero", nullable = false)
    private Pasajero pasajero;

    public Equipaje() {}

    public Equipaje(double peso, String descripcion, Pasajero pasajero) {
        this.peso = peso;
        this.descripcion = descripcion;
        this.pasajero = pasajero;
    }

    public int getIdEquipaje() {
        return idEquipaje;
    }

    public void setIdEquipaje(int idEquipaje) {
        this.idEquipaje = idEquipaje;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}

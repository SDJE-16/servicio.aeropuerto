package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;

@Entity
@Table(name="piloto")
public class Piloto extends Tripulacion {

    @Column(name="licencia")
    private String licencia;
    
    @Column(name="horas_vuelo")
    private int horasVuelo;

    public Piloto() {}

    public Piloto(String nombre, String identificacion, String licencia, int horasVuelo) {
        super(nombre, identificacion);
        this.licencia = licencia;
        this.horasVuelo = horasVuelo;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }
}

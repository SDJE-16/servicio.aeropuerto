package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;

@Entity
@Table(name="copiloto")
public class Copiloto extends Tripulacion {

    @Column(name="licencia")
    private String licencia;

    public Copiloto() {}

    public Copiloto(String nombre, String identificacion, String licencia) {
        super(nombre, identificacion);
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
}

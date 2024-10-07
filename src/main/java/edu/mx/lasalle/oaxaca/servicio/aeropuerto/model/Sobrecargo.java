package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;

@Entity
@Table(name="sobrecargo")
public class Sobrecargo extends Tripulacion {

    @Column(name="certificacion_servicio")
    private String certificacionServicio;

    public Sobrecargo() {}

    public Sobrecargo(String nombre, String identificacion, String certificacionServicio) {
        super(nombre, identificacion);
        this.certificacionServicio = certificacionServicio;
    }

    public String getCertificacionServicio() {
        return certificacionServicio;
    }

    public void setCertificacionServicio(String certificacionServicio) {
        this.certificacionServicio = certificacionServicio;
    }
}

package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;

@Entity
@Table(name="boleto")
public class Boleto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(fetch= FetchType.EAGER, optional = false )
    @JoinColumn(name="id_vuelo", nullable = false)
    private Vuelo vuelo;
    
    @ManyToOne(fetch= FetchType.EAGER, optional = false )
    @JoinColumn(name="id_pasajero", nullable = false)
    private Pasajero pasajero;
    
    @Column(name="asiento")
    private String asiento;

    public Boleto() {}

    public Boleto(Vuelo vuelo, Pasajero pasajero, String asiento) {
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.asiento = asiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
}

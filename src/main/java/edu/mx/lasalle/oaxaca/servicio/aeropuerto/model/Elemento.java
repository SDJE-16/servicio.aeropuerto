/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author jesus
 */
@Entity
@Table(name="elemento")
public class Elemento {
    
    @Id
    @Column (name="clave")
    private String clave;
    
    @Column (name="nombre")
    private String nombre;
    
    @Column (name ="precio")
    private double precio;
    
    @ManyToOne(fetch= FetchType.EAGER, optional = false )
    @JoinColumn(name="id_carrito", nullable = false)
    @OnDelete (action=OnDeleteAction.CASCADE)
    
    private Carrito carrito;

    public Elemento(String clave, String nombre, double precio, Carrito carrito) {
        this.clave = clave;
        this.nombre = nombre;
        this.precio = precio;
        this.carrito = carrito;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
    
    
    
}

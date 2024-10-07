package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Pasajero;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PasajeroService {
    List<Pasajero> getAllPasajeros();
    ResponseEntity<CustomResponse> addPasajero(Pasajero pasajero);
    ResponseEntity<CustomResponse> updatePasajero(int id, Pasajero pasajero);
    ResponseEntity<CustomResponse> deletePasajero(int id);
}

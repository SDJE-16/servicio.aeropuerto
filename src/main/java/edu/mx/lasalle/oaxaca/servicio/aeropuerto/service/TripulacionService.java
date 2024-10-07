package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Tripulacion;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TripulacionService {
    List<Tripulacion> getAllTripulacion();
    ResponseEntity<CustomResponse> addTripulacion(Tripulacion tripulacion);
    ResponseEntity<CustomResponse> updateTripulacion(int id, Tripulacion tripulacion);
    ResponseEntity<CustomResponse> deleteTripulacion(int id);
}

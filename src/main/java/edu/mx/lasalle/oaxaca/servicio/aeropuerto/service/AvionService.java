package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Avion;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AvionService {
    List<Avion> getAllAviones();
    ResponseEntity<CustomResponse> addAvion(Avion avion);
    ResponseEntity<CustomResponse> updateAvion(int id, Avion avion);
    ResponseEntity<CustomResponse> deleteAvion(int id);
}

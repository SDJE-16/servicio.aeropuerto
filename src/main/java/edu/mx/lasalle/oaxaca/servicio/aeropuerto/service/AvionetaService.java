package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Avioneta;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AvionetaService {
    List<Avioneta> getAllAvionetas();
    ResponseEntity<CustomResponse> addAvioneta(Avioneta avioneta);
    ResponseEntity<CustomResponse> updateAvioneta(int id, Avioneta avioneta);
    ResponseEntity<CustomResponse> deleteAvioneta(int id);
}

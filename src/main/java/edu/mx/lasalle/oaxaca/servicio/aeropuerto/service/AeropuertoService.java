package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Aeropuerto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AeropuertoService {
    List<Aeropuerto> getAllAeropuertos();
    ResponseEntity<CustomResponse> addAeropuerto(Aeropuerto aeropuerto);
    ResponseEntity<CustomResponse> updateAeropuerto(int id, Aeropuerto aeropuerto);
    ResponseEntity<CustomResponse> deleteAeropuerto(int id);
}

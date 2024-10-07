package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Piloto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PilotoService {
    List<Piloto> getAllPilotos();
    ResponseEntity<CustomResponse> addPiloto(Piloto piloto);
    ResponseEntity<CustomResponse> updatePiloto(int id, Piloto piloto);
    ResponseEntity<CustomResponse> deletePiloto(int id);
}

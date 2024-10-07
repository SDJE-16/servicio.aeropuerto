package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Sobrecargo;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SobrecargoService {
    List<Sobrecargo> getAllSobrecargos();
    ResponseEntity<CustomResponse> addSobrecargo(Sobrecargo sobrecargo);
    ResponseEntity<CustomResponse> updateSobrecargo(int id, Sobrecargo sobrecargo);
    ResponseEntity<CustomResponse> deleteSobrecargo(int id);
}

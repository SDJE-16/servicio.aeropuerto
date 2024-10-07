package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Copiloto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CopilotoService {
    List<Copiloto> getAllCopilotos();
    ResponseEntity<CustomResponse> addCopiloto(Copiloto copiloto);
    ResponseEntity<CustomResponse> updateCopiloto(int id, Copiloto copiloto);
    ResponseEntity<CustomResponse> deleteCopiloto(int id);
}

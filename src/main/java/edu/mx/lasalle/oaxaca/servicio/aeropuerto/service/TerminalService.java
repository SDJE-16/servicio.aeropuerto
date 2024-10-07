package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Terminal;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TerminalService {
    List<Terminal> getAllTerminals();
    ResponseEntity<CustomResponse> addTerminal(Terminal terminal);
    ResponseEntity<CustomResponse> updateTerminal(int id, Terminal terminal);
    ResponseEntity<CustomResponse> deleteTerminal(int id);
}

package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Terminal;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.TerminalRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.TerminalService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminalServiceImplements implements TerminalService {

    @Autowired
    private TerminalRepository terminalRepository;

    @Override
    public List<Terminal> getAllTerminales() {
        return terminalRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addTerminal(Terminal terminal) {
        terminalRepository.save(terminal);
        return ResponseEntity.ok(new CustomResponse("Terminal added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updateTerminal(int id, Terminal terminal) {
        terminal.setId(id);
        terminalRepository.save(terminal);
        return ResponseEntity.ok(new CustomResponse("Terminal updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deleteTerminal(int id) {
        terminalRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Terminal deleted successfully"));
    }
}

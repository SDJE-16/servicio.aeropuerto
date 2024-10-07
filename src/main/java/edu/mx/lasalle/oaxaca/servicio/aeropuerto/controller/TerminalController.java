package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Terminal;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.TerminalService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/terminales")
public class TerminalController {

    @Autowired
    private TerminalService terminalService;

    @GetMapping
    public ResponseEntity<List<Terminal>> getAllTerminales() {
        return ResponseEntity.ok(terminalService.getAllTerminales());
    }

    @PostMapping
    public ResponseEntity<CustomResponse> addTerminal(@RequestBody Terminal terminal) {
        return terminalService.addTerminal(terminal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomResponse> updateTerminal(@PathVariable int id, @RequestBody Terminal terminal) {
        return terminalService.updateTerminal(id, terminal);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomResponse> deleteTerminal(@PathVariable int id) {
        return terminalService.deleteTerminal(id);
    }
}

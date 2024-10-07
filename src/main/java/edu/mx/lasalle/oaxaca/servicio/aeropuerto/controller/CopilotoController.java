package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Copiloto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.CopilotoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/copilotos")
public class CopilotoController {

    @Autowired
    private CopilotoService copilotoService;

    @GetMapping
    public List<Copiloto> getAllCopilotos() {
        return copilotoService.getAllCopilotos();
    }

    @PostMapping
    public ResponseEntity<CustomResponse> addCopiloto(@RequestBody Copiloto copiloto) {
        return copilotoService.addCopiloto(copiloto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomResponse> updateCopiloto(@PathVariable int id, @RequestBody Copiloto copiloto) {
        return copilotoService.updateCopiloto(id, copiloto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomResponse> deleteCopiloto(@PathVariable int id) {
        return copilotoService.deleteCopiloto(id);
    }
}

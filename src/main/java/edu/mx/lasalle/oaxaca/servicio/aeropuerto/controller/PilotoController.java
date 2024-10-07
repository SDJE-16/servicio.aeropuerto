package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Piloto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.PilotoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pilotos")
public class PilotoController {

    @Autowired
    private PilotoService pilotoService;

    @GetMapping
    public ResponseEntity<List<Piloto>> getAllPilotos() {
        return ResponseEntity.ok(pilotoService.getAllPilotos());
    }

    @PostMapping
    public ResponseEntity<CustomResponse> addPiloto(@RequestBody Piloto piloto) {
        return pilotoService.addPiloto(piloto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomResponse> updatePiloto(@PathVariable int id, @RequestBody Piloto piloto) {
        return pilotoService.updatePiloto(id, piloto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomResponse> deletePiloto(@PathVariable int id) {
        return pilotoService.deletePiloto(id);
    }
}

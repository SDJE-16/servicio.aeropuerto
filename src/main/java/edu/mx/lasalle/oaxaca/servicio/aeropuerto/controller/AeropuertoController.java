package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Aeropuerto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.AeropuertoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aeropuertos")
public class AeropuertoController {

    @Autowired
    private AeropuertoService aeropuertoService;

    @GetMapping
    public ResponseEntity<List<Aeropuerto>> getAllAeropuertos() {
        return ResponseEntity.ok(aeropuertoService.getAllAeropuertos());
    }

    @PostMapping
    public ResponseEntity<CustomResponse> addAeropuerto(@RequestBody Aeropuerto aeropuerto) {
        return aeropuertoService.addAeropuerto(aeropuerto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomResponse> updateAeropuerto(@PathVariable int id, @RequestBody Aeropuerto aeropuerto) {
        return aeropuertoService.updateAeropuerto(id, aeropuerto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomResponse> deleteAeropuerto(@PathVariable int id) {
        return aeropuertoService.deleteAeropuerto(id);
    }
}

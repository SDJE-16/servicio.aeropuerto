package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Pasajero;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.PasajeroService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasajeros")
public class PasajeroController {

    @Autowired
    private PasajeroService pasajeroService;

    @GetMapping
    public List<Pasajero> getAllPasajeros() {
        return pasajeroService.getAllPasajeros();
    }

    @PostMapping
    public ResponseEntity<CustomResponse> addPasajero(@RequestBody Pasajero pasajero) {
        return pasajeroService.addPasajero(pasajero);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomResponse> updatePasajero(@PathVariable int id, @RequestBody Pasajero pasajero) {
        return pasajeroService.updatePasajero(id, pasajero);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomResponse> deletePasajero(@PathVariable int id) {
        return pasajeroService.deletePasajero(id);
    }
}

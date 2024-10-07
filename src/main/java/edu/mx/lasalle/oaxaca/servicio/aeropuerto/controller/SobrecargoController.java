package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Sobrecargo;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.SobrecargoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sobrecargos")
public class SobrecargoController {

    @Autowired
    private SobrecargoService sobrecargoService;

    @GetMapping
    public ResponseEntity<List<Sobrecargo>> getAllSobrecargos() {
        return ResponseEntity.ok(sobrecargoService.getAllSobrecargos());
    }

    @PostMapping
    public ResponseEntity<CustomResponse> addSobrecargo(@RequestBody Sobrecargo sobrecargo) {
        return sobrecargoService.addSobrecargo(sobrecargo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomResponse> updateSobrecargo(@PathVariable int id, @RequestBody Sobrecargo sobrecargo) {
        return sobrecargoService.updateSobrecargo(id, sobrecargo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomResponse> deleteSobrecargo(@PathVariable int id) {
        return sobrecargoService.deleteSobrecargo(id);
    }
}

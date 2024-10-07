package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Equipaje;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.EquipajeService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipajes")
public class EquipajeController {

    @Autowired
    private EquipajeService equipajeService;

    @GetMapping
    public ResponseEntity<List<Equipaje>> getAllEquipajes() {
        return ResponseEntity.ok(equipajeService.getAllEquipajes());
    }

    @PostMapping
    public ResponseEntity<CustomResponse> addEquipaje(@RequestBody Equipaje equipaje) {
        return equipajeService.addEquipaje(equipaje);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomResponse> updateEquipaje(@PathVariable int id, @RequestBody Equipaje equipaje) {
        return equipajeService.updateEquipaje(id, equipaje);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomResponse> deleteEquipaje(@PathVariable int id) {
        return equipajeService.deleteEquipaje(id);
    }
}

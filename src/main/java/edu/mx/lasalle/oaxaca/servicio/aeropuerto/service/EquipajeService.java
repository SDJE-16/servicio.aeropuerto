package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Equipaje;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EquipajeService {
    List<Equipaje> getAllEquipajes();
    ResponseEntity<CustomResponse> addEquipaje(Equipaje equipaje);
    ResponseEntity<CustomResponse> updateEquipaje(int id, Equipaje equipaje);
    ResponseEntity<CustomResponse> deleteEquipaje(int id);
}

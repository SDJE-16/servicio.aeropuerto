package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Equipaje;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.EquipajeRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.EquipajeService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipajeServiceImplements implements EquipajeService {

    @Autowired
    private EquipajeRepository equipajeRepository;

    @Override
    public List<Equipaje> getAllEquipajes() {
        return equipajeRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addEquipaje(Equipaje equipaje) {
        equipajeRepository.save(equipaje);
        return ResponseEntity.ok(new CustomResponse("Equipaje added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updateEquipaje(int id, Equipaje equipaje) {
        equipaje.setId(id);
        equipajeRepository.save(equipaje);
        return ResponseEntity.ok(new CustomResponse("Equipaje updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deleteEquipaje(int id) {
        equipajeRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Equipaje deleted successfully"));
    }
}

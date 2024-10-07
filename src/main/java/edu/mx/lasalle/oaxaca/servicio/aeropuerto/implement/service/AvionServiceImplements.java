package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Avion;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.AvionRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.AvionService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvionServiceImplements implements AvionService {

    @Autowired
    private AvionRepository avionRepository;

    @Override
    public List<Avion> getAllAviones() {
        return avionRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addAvion(Avion avion) {
        avionRepository.save(avion);
        return ResponseEntity.ok(new CustomResponse("Avión added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updateAvion(int id, Avion avion) {
        avion.setId(id);
        avionRepository.save(avion);
        return ResponseEntity.ok(new CustomResponse("Avión updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deleteAvion(int id) {
        avionRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Avión deleted successfully"));
    }
}

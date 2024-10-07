package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Pasajero;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.PasajeroRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.PasajeroService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroServiceImplements implements PasajeroService {

    @Autowired
    private PasajeroRepository pasajeroRepository;

    @Override
    public List<Pasajero> getAllPasajeros() {
        return pasajeroRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addPasajero(Pasajero pasajero) {
        pasajeroRepository.save(pasajero);
        return ResponseEntity.ok(new CustomResponse("Pasajero added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updatePasajero(int id, Pasajero pasajero) {
        pasajero.setId(id);
        pasajeroRepository.save(pasajero);
        return ResponseEntity.ok(new CustomResponse("Pasajero updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deletePasajero(int id) {
        pasajeroRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Pasajero deleted successfully"));
    }
}

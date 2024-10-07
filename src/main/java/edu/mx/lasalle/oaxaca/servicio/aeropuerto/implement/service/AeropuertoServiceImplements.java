package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Aeropuerto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.AeropuertoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.AeropuertoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AeropuertoServiceImplements implements AeropuertoService {

    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    @Override
    public List<Aeropuerto> getAllAeropuertos() {
        return aeropuertoRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addAeropuerto(Aeropuerto aeropuerto) {
        aeropuertoRepository.save(aeropuerto);
        return ResponseEntity.ok(new CustomResponse("Aeropuerto added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updateAeropuerto(int id, Aeropuerto aeropuerto) {
        aeropuerto.setId(id);
        aeropuertoRepository.save(aeropuerto);
        return ResponseEntity.ok(new CustomResponse("Aeropuerto updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deleteAeropuerto(int id) {
        aeropuertoRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Aeropuerto deleted successfully"));
    }
}

package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Piloto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.PilotoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.PilotoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotoServiceImplements implements PilotoService {

    @Autowired
    private PilotoRepository pilotoRepository;

    @Override
    public List<Piloto> getAllPilotos() {
        return pilotoRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addPiloto(Piloto piloto) {
        pilotoRepository.save(piloto);
        return ResponseEntity.ok(new CustomResponse("Piloto added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updatePiloto(int id, Piloto piloto) {
        piloto.setId(id);
        pilotoRepository.save(piloto);
        return ResponseEntity.ok(new CustomResponse("Piloto updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deletePiloto(int id) {
        pilotoRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Piloto deleted successfully"));
    }
}

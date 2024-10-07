package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Copiloto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.CopilotoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.CopilotoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CopilotoServiceImplements implements CopilotoService {

    @Autowired
    private CopilotoRepository copilotoRepository;

    @Override
    public List<Copiloto> getAllCopilotos() {
        return copilotoRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addCopiloto(Copiloto copiloto) {
        copilotoRepository.save(copiloto);
        return ResponseEntity.ok(new CustomResponse("Copiloto added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updateCopiloto(int id, Copiloto copiloto) {
        copiloto.setId(id);
        copilotoRepository.save(copiloto);
        return ResponseEntity.ok(new CustomResponse("Copiloto updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deleteCopiloto(int id) {
        copilotoRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Copiloto deleted successfully"));
    }
}

package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Sobrecargo;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.SobrecargoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.SobrecargoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SobrecargoServiceImplements implements SobrecargoService {

    @Autowired
    private SobrecargoRepository sobrecargoRepository;

    @Override
    public List<Sobrecargo> getAllSobrecargos() {
        return sobrecargoRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addSobrecargo(Sobrecargo sobrecargo) {
        sobrecargoRepository.save(sobrecargo);
        return ResponseEntity.ok(new CustomResponse("Sobrecargo added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updateSobrecargo(int id, Sobrecargo sobrecargo) {
        sobrecargo.setId(id);
        sobrecargoRepository.save(sobrecargo);
        return ResponseEntity.ok(new CustomResponse("Sobrecargo updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deleteSobrecargo(int id) {
        sobrecargoRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Sobrecargo deleted successfully"));
    }
}

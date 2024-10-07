package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Avioneta;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.AvionetaRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.AvionetaService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvionetaServiceImplements implements AvionetaService {

    @Autowired
    private AvionetaRepository avionetaRepository;

    @Override
    public List<Avioneta> getAllAvionetas() {
        return avionetaRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addAvioneta(Avioneta avioneta) {
        avionetaRepository.save(avioneta);
        return ResponseEntity.ok(new CustomResponse("Avioneta added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updateAvioneta(int id, Avioneta avioneta) {
        avioneta.setId(id);
        avionetaRepository.save(avioneta);
        return ResponseEntity.ok(new CustomResponse("Avioneta updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deleteAvioneta(int id) {
        avionetaRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Avioneta deleted successfully"));
    }
}

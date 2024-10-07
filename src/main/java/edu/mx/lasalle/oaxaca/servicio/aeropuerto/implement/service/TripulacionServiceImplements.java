package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Tripulacion;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.TripulacionRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.TripulacionService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripulacionServiceImplements implements TripulacionService {

    @Autowired
    private TripulacionRepository tripulacionRepository;

    @Override
    public List<Tripulacion> getAllTripulaciones() {
        return tripulacionRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addTripulacion(Tripulacion tripulacion) {
        tripulacionRepository.save(tripulacion);
        return ResponseEntity.ok(new CustomResponse("Tripulación added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updateTripulacion(int id, Tripulacion tripulacion) {
        tripulacion.setId(id);
        tripulacionRepository.save(tripulacion);
        return ResponseEntity.ok(new CustomResponse("Tripulación updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deleteTripulacion(int id) {
        tripulacionRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Tripulación deleted successfully"));
    }
}

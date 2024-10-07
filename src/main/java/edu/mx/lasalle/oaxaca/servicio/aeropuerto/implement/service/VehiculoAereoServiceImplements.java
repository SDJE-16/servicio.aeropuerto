package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.VehiculoAereo;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.VehiculoAereoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.VehiculoAereoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoAereoServiceImplements implements VehiculoAereoService {

    @Autowired
    private VehiculoAereoRepository vehiculoAereoRepository;

    @Override
    public List<VehiculoAereo> getAllVehiculosAereos() {
        return vehiculoAereoRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addVehiculoAereo(VehiculoAereo vehiculoAereo) {
        vehiculoAereoRepository.save(vehiculoAereo);
        return ResponseEntity.ok(new CustomResponse("Vehículo Aéreo added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updateVehiculoAereo(int id, VehiculoAereo vehiculoAereo) {
        vehiculoAereo.setId(id);
        vehiculoAereoRepository.save(vehiculoAereo);
        return ResponseEntity.ok(new CustomResponse("Vehículo Aéreo updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deleteVehiculoAereo(int id) {
        vehiculoAereoRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Vehículo Aéreo deleted successfully"));
    }
}

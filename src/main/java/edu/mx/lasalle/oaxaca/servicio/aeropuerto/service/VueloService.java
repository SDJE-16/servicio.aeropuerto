
package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Vuelo;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.VueloRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.VueloService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloServiceImplements implements VueloService {

    @Autowired
    private VueloRepository vueloRepository;

    @Override
    public List<Vuelo> getAllVuelos() {
        return vueloRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addVuelo(Vuelo vuelo) {
        vueloRepository.save(vuelo);
        return ResponseEntity.ok(new CustomResponse("Vuelo added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updateVuelo(int id, Vuelo vuelo) {
        vuelo.setId(id);
        vueloRepository.save(vuelo);
        return ResponseEntity.ok(new CustomResponse("Vuelo updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deleteVuelo(int id) {
        vueloRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Vuelo deleted successfully"));
    }
}

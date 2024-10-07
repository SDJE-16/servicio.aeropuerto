package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Vuelo;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VueloServiceImplements {
    List<Vuelo> getAllVuelos();
    ResponseEntity<CustomResponse> addVuelo(Vuelo vuelo);
    ResponseEntity<CustomResponse> updateVuelo(int id, Vuelo vuelo);
    ResponseEntity<CustomResponse> deleteVuelo(int id);
}


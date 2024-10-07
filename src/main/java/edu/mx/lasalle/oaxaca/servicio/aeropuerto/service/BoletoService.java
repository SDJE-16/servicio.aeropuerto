package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Boleto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BoletoService {
    List<Boleto> getAllBoletos();
    ResponseEntity<CustomResponse> addBoleto(Boleto boleto);
    ResponseEntity<CustomResponse> updateBoleto(int id, Boleto boleto);
    ResponseEntity<CustomResponse> deleteBoleto(int id);
}

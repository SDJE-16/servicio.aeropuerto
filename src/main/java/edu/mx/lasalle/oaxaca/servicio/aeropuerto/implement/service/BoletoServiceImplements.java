package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Boleto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.BoletoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.BoletoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletoServiceImplements implements BoletoService {

    @Autowired
    private BoletoRepository boletoRepository;

    @Override
    public List<Boleto> getAllBoletos() {
        return boletoRepository.findAll();
    }

    @Override
    public ResponseEntity<CustomResponse> addBoleto(Boleto boleto) {
        boletoRepository.save(boleto);
        return ResponseEntity.ok(new CustomResponse("Boleto added successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> updateBoleto(int id, Boleto boleto) {
        boleto.setId(id);
        boletoRepository.save(boleto);
        return ResponseEntity.ok(new CustomResponse("Boleto updated successfully"));
    }

    @Override
    public ResponseEntity<CustomResponse> deleteBoleto(int id) {
        boletoRepository.deleteById(id);
        return ResponseEntity.ok(new CustomResponse("Boleto deleted successfully"));
    }
}

package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.Boleto;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.BoletoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boletos")
public class BoletoController {

    @Autowired
    private BoletoService boletoService;

    @GetMapping
    public List<Boleto> getAllBoletos() {
        return boletoService.getAllBoletos();
    }

    @PostMapping
    public ResponseEntity<CustomResponse> addBoleto(@RequestBody Boleto boleto) {
        return boletoService.addBoleto(boleto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomResponse> updateBoleto(@PathVariable int id, @RequestBody Boleto boleto) {
        return boletoService.updateBoleto(id, boleto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomResponse> deleteBoleto(@PathVariable int id) {
        return boletoService.deleteBoleto(id);
    }
}

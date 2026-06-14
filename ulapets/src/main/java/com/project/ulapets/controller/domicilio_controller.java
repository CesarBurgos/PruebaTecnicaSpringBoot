package com.project.ulapets.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.project.ulapets.service.domicilio_service;
import com.project.ulapets.model.domicilioAdoptante_model;
import java.util.List;

@RestController
@RequestMapping("/api/domicilioAdoptante_model")
@RequiredArgsConstructor
public class domicilio_controller {
    private final domicilio_service domicilioService;

    @GetMapping
    public List<domicilioAdoptante_model> listaDomiciliosAdoptantes(){
        return domicilioService.listaDomiciliosAdoptantes();
    }

    @GetMapping("/{id}")
    public domicilioAdoptante_model buscarID(@PathVariable Integer id){
        return domicilioService.consultarDomicilioAdoptanteID(id);
    }

    @PostMapping
    public domicilioAdoptante_model guardarDispositivo(@RequestBody domicilioAdoptante_model dataDomicilioAdoptanteModel){
        return domicilioService.registarDomicilioAdoptante(dataDomicilioAdoptanteModel);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        domicilioService.eliminarDomicilio(id);
    }
}

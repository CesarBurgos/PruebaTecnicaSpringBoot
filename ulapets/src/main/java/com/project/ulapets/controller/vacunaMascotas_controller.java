package com.project.ulapets.controller;

import com.project.ulapets.model.vacunaMascota_model;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.project.ulapets.service.vacunaMascota_service;

import java.util.List;

@RestController
@RequestMapping("/api/vacunaMascotas")
@RequiredArgsConstructor
public class vacunaMascotas_controller {
    private final vacunaMascota_service vacunaMascotaService;

    @GetMapping
    public List<vacunaMascota_model> listaDomiciliosAdoptantes(){
        return vacunaMascotaService.listaVacunasMascotas();
    }

    @GetMapping("/{id}")
    public vacunaMascota_model buscarID(@PathVariable Integer id){
        return vacunaMascotaService.consultarVacunaID(id);
    }

    @PostMapping
    public vacunaMascota_model guardarDispositivo(@RequestBody vacunaMascota_model dataVacuna){
        return vacunaMascotaService.registarVacunaMascota(dataVacuna);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        vacunaMascotaService.eliminarVacuna(id);
    }
}

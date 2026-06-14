package com.project.ulapets.controller;

import com.project.ulapets.model.mascota_model;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.project.ulapets.service.mascota_service;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
@RequiredArgsConstructor
public class mascotas_controller {
    private final mascota_service mascotasService;

    @GetMapping
    public List<mascota_model> listaMascotas(){
        return mascotasService.listaMascotas();
    }

    @GetMapping("/{id}")
    public mascota_model buscarID(@PathVariable Integer id){
        return mascotasService.consultarMascotaID(id);
    }

    @PostMapping
    public mascota_model regitrar(@RequestBody mascota_model dataMascotaModel){
        return mascotasService.registarMascota(dataMascotaModel);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        mascotasService.eliminarMascota(id);
    }
}

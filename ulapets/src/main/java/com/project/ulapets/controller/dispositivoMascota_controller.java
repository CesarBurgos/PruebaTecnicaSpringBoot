package com.project.ulapets.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.project.ulapets.service.dispositivoMascotas_service;
import com.project.ulapets.model.dispositivoMascota_model;
import java.util.List;

@RestController
@RequestMapping("/api/dispositivosMascotas")
@RequiredArgsConstructor
public class dispositivoMascota_controller {
    private final dispositivoMascotas_service dispositivoMascotasService;

    @GetMapping
    public List<dispositivoMascota_model> listaDispositivos(){
        return dispositivoMascotasService.listaDispositivosMascotas();
    }

    @GetMapping("/{id}")
    public dispositivoMascota_model buscarID(@PathVariable Integer id){
        return dispositivoMascotasService.consultarDispositivoID(id);
    }

    @PostMapping
    public dispositivoMascota_model guardarDispositivo(@RequestBody dispositivoMascota_model dataDispositivo){
        return dispositivoMascotasService.registarDispositivo(dataDispositivo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        dispositivoMascotasService.eliminarDispositivo(id);
    }
}

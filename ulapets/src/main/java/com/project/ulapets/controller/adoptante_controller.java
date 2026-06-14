package com.project.ulapets.controller;

import com.project.ulapets.model.adoptante_model;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.project.ulapets.service.adoptante_service;

import java.util.List;

@RestController
@RequestMapping("/api/adoptantes")
@RequiredArgsConstructor
public class adoptante_controller {
    private final adoptante_service adoptanteService;

    @GetMapping
    public List<adoptante_model> listaAdoptantes(){
        return adoptanteService.listaAdoptantes();
    }

    @GetMapping("/{id}")
    public adoptante_model buscarID(@PathVariable Integer id){
        return adoptanteService.consultarAdoptanteID(id);
    }

    @PostMapping
    public adoptante_model guardarAdoptante(@RequestBody adoptante_model dataAdoptanteModel){
        return adoptanteService.registarAdoptante(dataAdoptanteModel);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        adoptanteService.eliminarAdoptante(id);
    }
}

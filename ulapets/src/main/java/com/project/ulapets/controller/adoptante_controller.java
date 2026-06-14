package com.project.ulapets.controller;

import com.project.ulapets.dto.ApiResponse;
import com.project.ulapets.model.adoptante_model;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project.ulapets.service.adoptante_service;

import java.util.List;

@RestController
@RequestMapping("/api/adoptantes")
@RequiredArgsConstructor
public class adoptante_controller {
    private final adoptante_service adoptanteService;

    @GetMapping
    public ResponseEntity<ApiResponse<?>> listaAdoptantes(){
        return ResponseEntity.ok(new ApiResponse<>(true, "ok", adoptanteService.listaAdoptantes()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<?>>  buscarID(@PathVariable Integer id){
        try {
            adoptante_model adoptante = adoptanteService.consultarAdoptanteID(id);
            return ResponseEntity.ok(new ApiResponse<>(true, "ok", adoptante));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>(false, "No se encontró consultante", null));
        }
    }

    @PostMapping
    public ResponseEntity<ApiResponse<?>> guardarAdoptante(@RequestBody adoptante_model dataAdoptanteModel){
        return ResponseEntity.ok(new ApiResponse<>(true, "ok", adoptanteService.registarAdoptante(dataAdoptanteModel)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> actualizar(@PathVariable Integer id, @RequestBody adoptante_model dataAdoptanteModel){
        return ResponseEntity.ok(new ApiResponse<>(true, "ok", adoptanteService.actualizar(id, dataAdoptanteModel)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> eliminar(@PathVariable Integer id){
        adoptanteService.eliminarAdoptante(id);

        return ResponseEntity.ok(new ApiResponse<>(true, "ok", null));
    }
}

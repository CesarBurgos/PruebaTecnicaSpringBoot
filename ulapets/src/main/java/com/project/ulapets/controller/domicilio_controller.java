package com.project.ulapets.controller;

import com.project.ulapets.dto.ApiResponse;
import com.project.ulapets.model.dispositivoMascota_model;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ApiResponse<?>> listaDomiciliosAdoptantes(){
        return ResponseEntity.ok(new ApiResponse<>(true, "ok", domicilioService.listaDomiciliosAdoptantes()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> buscarID(@PathVariable Integer id){
        try {
            domicilioAdoptante_model domAdoptante = domicilioService.consultarDomicilioAdoptanteID(id);
            return ResponseEntity.ok(new ApiResponse<>(true, "ok", domAdoptante));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>(false, "No se encontró el domicilio del Adoptante", null));
        }
    }

    @PostMapping
    public ResponseEntity<ApiResponse<?>> guardarDispositivo(@RequestBody domicilioAdoptante_model dataDomicilioAdoptanteModel){
        return ResponseEntity.ok(new ApiResponse<>(true, "ok", domicilioService.registarDomicilioAdoptante(dataDomicilioAdoptanteModel)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> eliminar(@PathVariable Integer id){
        domicilioService.eliminarDomicilio(id);

        return ResponseEntity.ok(new ApiResponse<>(true, "ok", null));
    }
}

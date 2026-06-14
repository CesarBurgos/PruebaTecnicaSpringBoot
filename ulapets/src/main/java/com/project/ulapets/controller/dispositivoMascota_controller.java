package com.project.ulapets.controller;

import com.project.ulapets.dto.ApiResponse;
import com.project.ulapets.model.adoptante_model;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ApiResponse<?>> listaDispositivos(){
        return ResponseEntity.ok(new ApiResponse<>(true, "ok", dispositivoMascotasService.listaDispositivosMascotas()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<?>>  buscarID(@PathVariable Integer id){

        try {
            dispositivoMascota_model dispositivo = dispositivoMascotasService.consultarDispositivoID(id);
            return ResponseEntity.ok(new ApiResponse<>(true, "ok", dispositivo));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>(false, "No se encontró dispositivo", null));
        }
    }

    @PostMapping
    public ResponseEntity<ApiResponse<?>>  guardarDispositivo(@RequestBody dispositivoMascota_model dataDispositivo){
        return ResponseEntity.ok(new ApiResponse<>(true, "ok", dispositivoMascotasService.registarDispositivo(dataDispositivo)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> eliminar(@PathVariable Integer id){
        dispositivoMascotasService.eliminarDispositivo(id);

        return ResponseEntity.ok(new ApiResponse<>(true, "ok", null));
    }
}

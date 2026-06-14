package com.project.ulapets.controller;

import com.project.ulapets.dto.ApiResponse;
import com.project.ulapets.dto.vacunaRequest;
import com.project.ulapets.model.vacunaMascota_model;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project.ulapets.service.vacunaMascota_service;

import java.util.List;

@RestController
@RequestMapping("/api/vacunaMascotas")
@RequiredArgsConstructor
public class vacunaMascotas_controller {
    private final vacunaMascota_service vacunaMascotaService;

    @GetMapping
    public ResponseEntity<ApiResponse<?>> listaDomiciliosAdoptantes(){
        return ResponseEntity.ok(new ApiResponse<>(true, "ok", vacunaMascotaService.listaVacunasMascotas()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> buscarID(@PathVariable Integer id){
        try {
            vacunaMascota_model vacuna = vacunaMascotaService.consultarVacunaID(id);
            return ResponseEntity.ok(new ApiResponse<>(true, "ok", vacuna));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>(false, "No se encontró la mascota", null));
        }
    }

    @GetMapping("/mascota/{idMascota}")
    public ResponseEntity<ApiResponse<?>>  historial(@PathVariable Integer idMascota) {

        try {
            List<vacunaMascota_model>  vacunas = vacunaMascotaService.obtenerHistorial(idMascota);
            return ResponseEntity.ok(new ApiResponse<>(true, "ok", vacunas));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>(false, "No se encontró la mascota", null));
        }
    }

    @PostMapping
    public ResponseEntity<ApiResponse<?>> guardarVacuna(@RequestBody vacunaRequest dataVacuna){
        return ResponseEntity.ok(new ApiResponse<>(true, "ok", vacunaMascotaService.registarVacunaMascota(dataVacuna)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> eliminar(@PathVariable Integer id){
        vacunaMascotaService.eliminarVacuna(id);

        return ResponseEntity.ok(new ApiResponse<>(true, "ok", null));
    }
}

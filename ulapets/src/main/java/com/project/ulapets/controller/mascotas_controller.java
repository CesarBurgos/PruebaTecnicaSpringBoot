package com.project.ulapets.controller;

import com.project.ulapets.dto.ApiResponse;
import com.project.ulapets.dto.mascotaRequest;
import com.project.ulapets.model.domicilioAdoptante_model;
import com.project.ulapets.model.mascota_model;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project.ulapets.service.mascota_service;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
@RequiredArgsConstructor
public class mascotas_controller {
    private final mascota_service mascotasService;

    @GetMapping
    public ResponseEntity<ApiResponse<?>> listaMascotas(){
        return ResponseEntity.ok(new ApiResponse<>(true, "ok", mascotasService.listaMascotas()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<?>>  buscarID(@PathVariable Integer id){
        try {
            mascota_model mascota = mascotasService.consultarMascotaID(id);
            return ResponseEntity.ok(new ApiResponse<>(true, "ok", mascota));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>(false, "No se encontró la mascota", null));
        }
    }

    @GetMapping("/adoptante/{idAdoptante}")
    public ResponseEntity<ApiResponse<?>>  obtenerPorAdoptante(@PathVariable Integer idAdoptante) {
        try {
            List<mascota_model> mascotas = mascotasService.obtenerPorAdoptante(idAdoptante);
            return ResponseEntity.ok(new ApiResponse<>(true, "ok", mascotas));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>(false, "No se encontraron mascotas con el adoptante", null));
        }
    }

    @PostMapping
    public ResponseEntity<ApiResponse<?>>  regitrar(@RequestBody mascotaRequest dataMascotaModel){
        return ResponseEntity.ok(new ApiResponse<>(true, "ok", mascotasService.registarMascota(dataMascotaModel)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>>  eliminar(@PathVariable Integer id){
        mascotasService.eliminarMascota(id);

        return ResponseEntity.ok(new ApiResponse<>(true, "ok", null));
    }
}

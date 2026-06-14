package com.project.ulapets.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class vacunaRequest {
    private Integer idMascota;
    private String nombreVacuna;
    private LocalDateTime fechaAplicacion;
    private LocalDateTime fechaProximaDosis;
    private String veterinarioResponsable;
}

package com.project.ulapets.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class mascotaRequest {
    private Integer idAdoptante;
    private String nombre;
    private String especie;
    private String raza;
    private String sexo;
    private LocalDateTime fechaNacimiento;
}

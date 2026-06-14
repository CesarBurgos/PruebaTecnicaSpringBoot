package com.project.ulapets.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "vacuna_mascota")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class vacunaMascota_model {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vacuna_mascota")
    @SequenceGenerator(name = "seq_vacuna_mascota", sequenceName = "SEQ_VACUNA_MASCOTA", allocationSize = 1)
    private Integer idVacuna;

    //@OneToMany
    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private mascota_model idMascota;

    @Column(name = "nombre_vacuna")
    private String nombreVacuna;

    @Column(name = "fecha_aplicacion")
    private LocalDateTime fechaAplicacion = LocalDateTime.now();

    @Column(name = "fecha_proxima_dosis")
    private LocalDateTime fechaProximaDosis;

    @Column(name = "veterinario_responsable")
    private String veterinarioResponsable;

    private Integer estado = 1;
}

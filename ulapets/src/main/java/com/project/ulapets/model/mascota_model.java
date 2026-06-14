package com.project.ulapets.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "mascota")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class mascota_model {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_mascota")
    @SequenceGenerator(name = "seq_mascota", sequenceName = "SEQ_MASCOTA", allocationSize = 1)
    @Column(name = "id_mascota")
    private Integer idMascota;

    //@OneToMany
    @ManyToOne
    @JoinColumn(name = "id_adoptante")
    private adoptante_model idAdoptante;

    private String nombre;

    private String especie;

    private String raza;

    private String sexo;

    @Column(name = "fecha_nacimiento")
    private LocalDateTime fechaNacimiento = LocalDateTime.now();;

    private Double peso;

    private String color;

    private Integer estado = 1;
}

package com.project.ulapets.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dispostivo_mascota")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class dispositivoMascota_model {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_disp_mascota")
    @SequenceGenerator(name = "seq_disp_mascota", sequenceName = "SEQ_DISP_MASCOTA", allocationSize = 1)
    @Column(name = "id_dispositivo")
    private Integer idDispositivo;

    //@OneToMany
    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private mascota_model idMascota;

    @Column(name = "numero_chip")
    private String numeroChip;

    @Column(name = "tipo_dispositivo")
    private String tipoDispositivo;

    @Column(name = "fecha_instalacion")
    private String fechaInstalacion;

    private Integer estado = 1;
}

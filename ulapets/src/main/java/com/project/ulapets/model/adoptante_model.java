package com.project.ulapets.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "adoptante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class adoptante_model {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_adoptante")
    @SequenceGenerator(name = "seq_adoptante", sequenceName = "SEQ_ADOPTANTE", allocationSize = 1)
    @Column(name = "id_adoptante")
    private Long idAdoptante;

    private String nombre;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    private String telefono;

    private String correo;

    @Column(name = "fecha_registro")
    private String fechaRegistro;

    private Integer estado;
}

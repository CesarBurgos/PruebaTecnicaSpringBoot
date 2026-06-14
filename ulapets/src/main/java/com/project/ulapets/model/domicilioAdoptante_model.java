package com.project.ulapets.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "domicilio_adoptante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class domicilioAdoptante_model {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_dom_adoptante")
    @SequenceGenerator(name = "seq_dom_adoptante", sequenceName = "SEQ_DOM_ADOPTANTE", allocationSize = 1)
    @Column(name = "id_domicilio")
    private Integer idDomicilio;

    //@OneToMany
    @ManyToOne
    @JoinColumn(name = "id_adoptante")
    private adoptante_model idAdoptante;

    private String calle;

    @Column(name = "numero_exterior")
    private String numeroExterior;

    private String colonia;

    private String ciudad;

    @Column(name = "estado_geografico")
    private String estadoGeografico;

    @Column(name = "codigo_postal")
    private String codigoPostal;

    private Integer estado = 1;
}

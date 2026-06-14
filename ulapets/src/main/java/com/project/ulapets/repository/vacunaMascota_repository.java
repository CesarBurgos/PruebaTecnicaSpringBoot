package com.project.ulapets.repository;

import com.project.ulapets.model.vacunaMascota_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface vacunaMascota_repository extends JpaRepository<vacunaMascota_model, Integer> {
    boolean existsByIdMascotaIdMascotaAndNombreVacunaAndFechaAplicacion(
            Integer idMascota,
            String nombreVacuna,
            LocalDateTime fechaAplicacion
    );

    List<vacunaMascota_model> findByIdMascotaIdMascota(Integer idMascota);
}

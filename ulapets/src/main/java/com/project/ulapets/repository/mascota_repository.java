package com.project.ulapets.repository;

import com.project.ulapets.model.mascota_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface mascota_repository extends JpaRepository<mascota_model, Integer> {
    List<mascota_model> findByIdAdoptanteIdAdoptante(Integer idAdoptante);
}

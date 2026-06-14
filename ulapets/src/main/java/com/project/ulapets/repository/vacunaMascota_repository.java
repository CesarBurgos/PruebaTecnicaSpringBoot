package com.project.ulapets.repository;

import com.project.ulapets.model.vacunaMascota_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vacunaMascota_repository extends JpaRepository<vacunaMascota_model, Integer> {
}

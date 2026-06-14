package com.project.ulapets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ulapets.model.dispositivoMascota_model;
import org.springframework.stereotype.Repository;

@Repository
public interface dispositvosMascota_repository extends JpaRepository<dispositivoMascota_model, Integer> {
}

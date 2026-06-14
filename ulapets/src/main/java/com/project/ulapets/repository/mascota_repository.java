package com.project.ulapets.repository;

import com.project.ulapets.model.mascota_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mascota_repository extends JpaRepository<mascota_model, Integer> {
}

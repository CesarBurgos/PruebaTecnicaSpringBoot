package com.project.ulapets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ulapets.model.domicilioAdoptante_model;
import org.springframework.stereotype.Repository;

@Repository
public interface domicilioAdoptante_repository extends JpaRepository<domicilioAdoptante_model, Integer> {
}

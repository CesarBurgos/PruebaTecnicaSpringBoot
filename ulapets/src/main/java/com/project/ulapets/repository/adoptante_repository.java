package com.project.ulapets.repository;

import com.project.ulapets.model.adoptante_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adoptante_repository extends JpaRepository<adoptante_model, Integer> {
}

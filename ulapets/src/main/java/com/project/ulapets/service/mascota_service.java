package com.project.ulapets.service;

import com.project.ulapets.model.mascota_model;
import com.project.ulapets.repository.mascota_repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class mascota_service {
    private final mascota_repository mascotaRepository;

    public List<mascota_model> listaMascotas(){
        return mascotaRepository.findAll();
    }

    public mascota_model registarMascota(mascota_model mascotaModelRegistrar){
        return mascotaRepository.save(mascotaModelRegistrar);
    }

    public mascota_model consultarMascotaID(Integer id){
        return mascotaRepository.findById(id).orElseThrow(() -> new RuntimeException("no se encontró la mascota_model"));
    }

    public void eliminarMascota(Integer id){
        mascota_model mascota = consultarMascotaID(id);
        mascota.setEstado(0);

        mascotaRepository.save(mascota);
    }
}

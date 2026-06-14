package com.project.ulapets.service;

import com.project.ulapets.model.vacunaMascota_model;
import com.project.ulapets.repository.vacunaMascota_repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class vacunaMascota_service {
    private final vacunaMascota_repository vacunaMascotaRepository;

    public List<vacunaMascota_model> listaVacunasMascotas(){
        return vacunaMascotaRepository.findAll();
    }

    public vacunaMascota_model registarVacunaMascota(vacunaMascota_model vacunaRegistrar){
        return vacunaMascotaRepository.save(vacunaRegistrar);
    }

    public vacunaMascota_model consultarVacunaID(Integer id){
        return vacunaMascotaRepository.findById(id).orElseThrow(() -> new RuntimeException("no se encontró la vacuna por ID"));
    }

    public void eliminarVacuna(Integer id){
        vacunaMascota_model vacuna = consultarVacunaID(id);
        vacuna.setEstado(0);

        vacunaMascotaRepository.save(vacuna);
    }
}

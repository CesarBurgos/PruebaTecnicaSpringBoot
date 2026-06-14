package com.project.ulapets.service;

import com.project.ulapets.dto.vacunaRequest;
import com.project.ulapets.model.mascota_model;
import com.project.ulapets.model.vacunaMascota_model;
import com.project.ulapets.repository.mascota_repository;
import com.project.ulapets.repository.vacunaMascota_repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class vacunaMascota_service {
    private final vacunaMascota_repository vacunaMascotaRepository;
    private final mascota_repository mascotaRepository;

    public List<vacunaMascota_model> listaVacunasMascotas(){
        return vacunaMascotaRepository.findAll();
    }

    public List<vacunaMascota_model> obtenerHistorial(Integer idMascota) {
        return vacunaMascotaRepository.findByIdMascotaIdMascota(idMascota);
    }

    @Transactional
    public vacunaMascota_model registarVacunaMascota(vacunaRequest vacunaRegistrarData){
        //return vacunaMascotaRepository.save(vacunaRequest);
        mascota_model mascota =
                mascotaRepository.findById(vacunaRegistrarData.getIdMascota()).orElseThrow(()-> new RuntimeException("No se encontró a la mascota"));

        boolean existe =
                vacunaMascotaRepository
                        .existsByIdMascotaIdMascotaAndNombreVacunaAndFechaAplicacion(
                                vacunaRegistrarData.getIdMascota(),
                                vacunaRegistrarData.getNombreVacuna(),
                                vacunaRegistrarData.getFechaAplicacion());

        if (existe) {
            throw new RuntimeException("La vacuna registrada anteriormente...");
        }

        vacunaMascota_model vacuna = new vacunaMascota_model();

        vacuna.setIdMascota(mascota);
        vacuna.setNombreVacuna(vacunaRegistrarData.getNombreVacuna());
        vacuna.setFechaAplicacion(vacunaRegistrarData.getFechaAplicacion());

        if (vacunaRegistrarData.getFechaProximaDosis() != null) {
            vacuna.setFechaProximaDosis(vacunaRegistrarData.getFechaProximaDosis());
        } else {
            vacuna.setFechaProximaDosis(vacunaRegistrarData.getFechaAplicacion().plusYears(1)); // Vacuna dentro de un año
        }

        vacuna.setEstado(1);

        return vacunaMascotaRepository.save(vacuna);
    }

    public vacunaMascota_model consultarVacunaID(Integer id){
        return vacunaMascotaRepository.findById(id).orElseThrow(() -> new RuntimeException("no se encontró la vacuna por ID"));
    }

    @Transactional
    public void eliminarVacuna(Integer id){
        vacunaMascota_model vacuna = consultarVacunaID(id);
        vacuna.setEstado(0);

        vacunaMascotaRepository.save(vacuna);
    }
}

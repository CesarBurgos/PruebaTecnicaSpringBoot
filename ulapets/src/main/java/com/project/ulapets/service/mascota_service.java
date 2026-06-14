package com.project.ulapets.service;

import com.project.ulapets.dto.mascotaRequest;
import com.project.ulapets.model.adoptante_model;
import com.project.ulapets.model.mascota_model;
import com.project.ulapets.repository.adoptante_repository;
import com.project.ulapets.repository.mascota_repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class mascota_service {
    private final mascota_repository mascotaRepository;
    private final adoptante_repository adoptanteRepository;

    public List<mascota_model> listaMascotas(){
        return mascotaRepository.findAll();
    }

    public List<mascota_model> obtenerPorAdoptante(Integer idAdoptante) {
        return mascotaRepository.findByIdAdoptanteIdAdoptante(idAdoptante);
    }

    @Transactional
    public mascota_model registarMascota(mascotaRequest mascotaModelRegistrar){
        //return mascotaRepository.save(mascotaModelRegistrar);

        // Validando consultante
        if(mascotaModelRegistrar.getIdAdoptante() == null || mascotaModelRegistrar.getIdAdoptante() == 0){
            throw new RuntimeException("Debe ingresar un ID adoptante valido");
        }

        if (mascotaModelRegistrar.getNombre() == null || mascotaModelRegistrar.getNombre().isBlank()) {
            throw new RuntimeException("Nombre obligatorio");
        }

        adoptante_model adoptante =
                adoptanteRepository.findById(
                                mascotaModelRegistrar.getIdAdoptante())
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Adoptante no encontrado"));

        mascota_model mascota = new mascota_model();

        mascota.setIdAdoptante(adoptante);
        mascota.setNombre(mascotaModelRegistrar.getNombre());
        mascota.setEspecie(mascotaModelRegistrar.getEspecie());
        mascota.setRaza(mascotaModelRegistrar.getRaza());
        mascota.setSexo(mascotaModelRegistrar.getSexo());

        mascota.setEstado(1);
        mascota.setFechaNacimiento(mascotaModelRegistrar.getFechaNacimiento());

        return mascotaRepository.save(mascota);
    }

    public mascota_model consultarMascotaID(Integer id){
        return mascotaRepository.findById(id).orElseThrow(() -> new RuntimeException("no se encontró la mascota_model"));
    }

    @Transactional
    public void eliminarMascota(Integer id){
        mascota_model mascota = consultarMascotaID(id);
        mascota.setEstado(0);

        mascotaRepository.save(mascota);
    }
}

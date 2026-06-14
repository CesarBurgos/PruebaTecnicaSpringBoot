package com.project.ulapets.service;

import com.project.ulapets.model.adoptante_model;
import com.project.ulapets.repository.adoptante_repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class adoptante_service {
    private final adoptante_repository adoptanteRepository;

    public List<adoptante_model> listaAdoptantes(){
        return adoptanteRepository.findAll();
    }

    public adoptante_model registarAdoptante(adoptante_model adoptanteModelRegistrar){
        return adoptanteRepository.save(adoptanteModelRegistrar);
    }

    public adoptante_model consultarAdoptanteID(Integer id){
        return adoptanteRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro el adoptante"));
    }

    public void eliminarAdoptante(Integer id){
        adoptante_model adoptante = consultarAdoptanteID(id);
        adoptante.setEstado(0); // Se desactiva

        adoptanteRepository.save(adoptante);
    }
}

package com.project.ulapets.service;

import com.project.ulapets.model.adoptante_model;
import com.project.ulapets.repository.adoptante_repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class adoptante_service {
    private final adoptante_repository adoptanteRepository;

    public List<adoptante_model> listaAdoptantes(){
        return adoptanteRepository.findAll();
    }

    @Transactional
    public adoptante_model registarAdoptante(adoptante_model adoptanteModelRegistrar){
        return adoptanteRepository.save(adoptanteModelRegistrar);
    }

    public adoptante_model consultarAdoptanteID(Integer id){
        return adoptanteRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro el adoptante"));
    }

    @Transactional
    public adoptante_model actualizar(Integer id, adoptante_model request){
        adoptante_model adoptante = consultarAdoptanteID(id);

        adoptante.setNombre(request.getNombre());
        adoptante.setApellidoPaterno(request.getApellidoPaterno());
        adoptante.setApellidoMaterno(request.getApellidoMaterno());
        adoptante.setCorreo(request.getCorreo());
        adoptante.setTelefono(request.getTelefono());

        return adoptanteRepository.save(adoptante);
    }

    @Transactional
    public void eliminarAdoptante(Integer id){
        adoptante_model adoptante = consultarAdoptanteID(id);
        adoptante.setEstado(0); // Se desactiva

        adoptanteRepository.save(adoptante);
    }
}

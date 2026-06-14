package com.project.ulapets.service;

import com.project.ulapets.model.domicilioAdoptante_model;
import com.project.ulapets.repository.domicilioAdoptante_repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class domicilio_service {
    private final domicilioAdoptante_repository domicilioAdoptanteRepository;

    public List<domicilioAdoptante_model> listaDomiciliosAdoptantes(){
        return domicilioAdoptanteRepository.findAll();
    }

    @Transactional
    public domicilioAdoptante_model registarDomicilioAdoptante(domicilioAdoptante_model domicilioRegistrar){
        return domicilioAdoptanteRepository.save(domicilioRegistrar);
    }

    public domicilioAdoptante_model consultarDomicilioAdoptanteID(Integer ID){
        return domicilioAdoptanteRepository.findById(ID).orElseThrow(() -> new RuntimeException("no se encontró el domicilio indicado ID"));
    }

    @Transactional
    public void eliminarDomicilio(Integer id){
        domicilioAdoptante_model domicilio = consultarDomicilioAdoptanteID(id);
        domicilio.setEstado(0);

        domicilioAdoptanteRepository.save(domicilio);
    }
}

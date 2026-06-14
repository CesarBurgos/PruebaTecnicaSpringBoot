package com.project.ulapets.service;

import com.project.ulapets.repository.dispositvosMascota_repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import com.project.ulapets.model.dispositivoMascota_model;

@Service
@RequiredArgsConstructor
public class dispositivoMascotas_service {
    private final dispositvosMascota_repository dispositvosMascotaRepository;

    public List<dispositivoMascota_model> listaDispositivosMascotas(){
        return dispositvosMascotaRepository.findAll();
    }

    public dispositivoMascota_model registarDispositivo(dispositivoMascota_model dispositivoRegistrar){
        return dispositvosMascotaRepository.save(dispositivoRegistrar);
    }

    public dispositivoMascota_model consultarDispositivoID(Integer id){
        return dispositvosMascotaRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontró el dispositivo"));
    }

    public void eliminarDispositivo(Integer id){
        dispositivoMascota_model dispositivo = consultarDispositivoID(id);
        dispositivo.setEstado(0);

        dispositvosMascotaRepository.save(dispositivo);
    }
}

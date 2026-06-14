package com.project.ulapets.service;

import com.project.ulapets.dto.dispositivoRequest;
import com.project.ulapets.model.mascota_model;
import com.project.ulapets.repository.dispositvosMascota_repository;
import com.project.ulapets.repository.mascota_repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import com.project.ulapets.model.dispositivoMascota_model;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class dispositivoMascotas_service {
    private final dispositvosMascota_repository dispositvosMascotaRepository;
    private final mascota_repository mascotaRepository;

    public List<dispositivoMascota_model> listaDispositivosMascotas(){
        return dispositvosMascotaRepository.findAll();
    }

    @Transactional
    public dispositivoMascota_model registarDispositivo(dispositivoRequest dispositivoRegistrarData){
        //return dispositvosMascotaRepository.save(dispositivoRequest);

        mascota_model mascota = mascotaRepository.findById(dispositivoRegistrarData.getIdMascota()).orElseThrow(() -> new RuntimeException("No existe la mascota"));

        dispositivoMascota_model dispositivo = new dispositivoMascota_model();

        dispositivo.setIdMascota(mascota);
        dispositivo.setNumChip(dispositivoRegistrarData.getNumeroChip());
        dispositivo.setTipoDispositivo(dispositivoRegistrarData.getTipoDispositivo());
        dispositivo.setFechaInstalacion(LocalDateTime.now());

        return dispositvosMascotaRepository.save(dispositivo);
    }

    public dispositivoMascota_model consultarDispositivoID(Integer id){
        return dispositvosMascotaRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontró el dispositivo"));
    }

    @Transactional
    public void eliminarDispositivo(Integer id){
        dispositivoMascota_model dispositivo = consultarDispositivoID(id);
        dispositivo.setEstado(0);

        dispositvosMascotaRepository.save(dispositivo);
    }
}

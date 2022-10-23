package com.backendPortfolio.backend.service;

import com.backendPortfolio.backend.entity.Persona;
import com.backendPortfolio.backend.security.jwt.repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ImpPersonaService{
    @Autowired
    IPersonaRepository iPersonaRepository;
    
    public List<Persona> list(){
        return iPersonaRepository.findAll();
    }
    public Optional<Persona>getOne(int id){
        return iPersonaRepository.findById(id);
    }
    public boolean existsById(int id){
        return iPersonaRepository.existsById(id);
    }
    public void save(Persona persona){
        iPersonaRepository.save(persona);
    }
}

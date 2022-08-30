package com.backendPortfolio.backend.Security.service;

import com.backendPortfolio.backend.Security.Entity.Persona;
import com.backendPortfolio.backend.Security.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService{
    @Autowired
    IPersonaRepository iPersonaRepository;
    
    public List<Persona> list(){
        return iPersonaRepository.findAll();
    }
    
    public Optional<Persona>getOne(int id){
        return iPersonaRepository.findById(id);
    }
    
    public void save(Persona persona){
        iPersonaRepository.save(persona);
    }
}

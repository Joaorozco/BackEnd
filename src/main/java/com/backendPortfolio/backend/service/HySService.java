package com.backendPortfolio.backend.service;

import com.backendPortfolio.backend.entity.HyS;
import com.backendPortfolio.backend.security.jwt.repository.HySRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class HySService {
    @Autowired
    HySRepository hysRepository;

    public List<HyS> list(){
        return hysRepository.findAll();
    }

    public Optional<HyS> getOne(int id){
        return hysRepository.findById(id);
    }

    public Optional<HyS> getByNombre(String nombre) {
        return hysRepository.findByName(nombre);
    }

    public void save(HyS skill){
        hysRepository.save(skill);
    }

    public void delete(int id){
        hysRepository.deleteById(id);
    }

    public boolean existsByName(String name){
        return hysRepository.existsByName(name);
    }

    public boolean existsById(int id){
        return !hysRepository.existsById(id);
    }
}
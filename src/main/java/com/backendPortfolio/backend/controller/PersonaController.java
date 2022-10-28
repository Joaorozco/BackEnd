package com.backendPortfolio.backend.controller;

import com.backendPortfolio.backend.dto.dtoPersona;
import com.backendPortfolio.backend.security.Controller.Mensaje;
import com.backendPortfolio.backend.entity.Persona;


import java.util.List;

import com.backendPortfolio.backend.service.ImpPersonaService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://front-endportfolio.web.app/")
@Log4j2
@SuppressWarnings("unchecked")
public class PersonaController {
    @Autowired
    ImpPersonaService iPersonaService;

    @GetMapping("/datap")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = iPersonaService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/detailp/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") int id){
        if(!iPersonaService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Persona persona = iPersonaService.getOne(id).get();
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPersona dtopersona){
        Persona persona = iPersonaService.getOne(id).get();
        persona.setNombreCompleto(dtopersona.getNombreCompleto());
        persona.setProfesion(dtopersona.getProfesion());
        persona.setDescripcion(dtopersona.getDescripcion());
        persona.setImagen(dtopersona.getImagen());
        
        iPersonaService.save(persona);
        return new ResponseEntity<>(new Mensaje("Update exitoso"), HttpStatus.OK);
    }
 }   


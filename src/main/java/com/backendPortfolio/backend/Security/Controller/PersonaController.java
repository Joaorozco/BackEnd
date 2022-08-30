package com.backendPortfolio.backend.Security.Controller;

import com.backendPortfolio.backend.Dto.dtoPersona;
import com.backendPortfolio.backend.Security.Entity.Persona;
import com.backendPortfolio.backend.Security.service.ImpPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PersonaController {
    @Autowired 
    ImpPersonaService iPersonaService;
    
    @GetMapping("/datap")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = iPersonaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPersona dtopersona){
        Persona persona = iPersonaService.getOne(id).get();
        persona.setNombreCompleto(dtopersona.getNombreCompleto());
        persona.setProfesion(dtopersona.getProfesion());
        persona.setDescripcion(dtopersona.getDescripcion());
        persona.setImagen(dtopersona.getImagen());
        
        iPersonaService.save(persona);
        return new ResponseEntity(new Mensaje("Update exitoso"), HttpStatus.OK);
    }
     
 }   


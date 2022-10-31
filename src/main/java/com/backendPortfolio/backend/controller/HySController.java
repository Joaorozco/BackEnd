package com.backendPortfolio.backend.controller;

import com.backendPortfolio.backend.dto.dtoHyS;
import com.backendPortfolio.backend.entity.HyS;
import com.backendPortfolio.backend.security.controller.Mensaje;
import com.backendPortfolio.backend.service.HySService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/skills")
@CrossOrigin(origins = "https://portfolio-12221.web.app")
public class HySController {

    @Autowired
    private final HySService hysService;

    public HySController(HySService hysService) {
        this.hysService = hysService;
    }

    @GetMapping("/lista")
    public ResponseEntity<List<HyS>> list(){
        List<HyS> list = hysService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<HyS> getById(@PathVariable("id") int id){
        if(hysService.existsById(id)){
           return new ResponseEntity(new Mensaje("No existe Id"), HttpStatus.BAD_REQUEST);
        }
        HyS skill = hysService.getOne(id).get();
        return new ResponseEntity(skill, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(hysService.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe id"), HttpStatus.NOT_FOUND);
        }
        hysService.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHyS dtoHys){
        if(StringUtils.isBlank(dtoHys.getName())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(hysService.existsByName(dtoHys.getName())){
            return new ResponseEntity(new Mensaje("Este nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        HyS newSkill = new HyS(dtoHys.getName(), dtoHys.getPorcentaje());
       hysService.save(newSkill);
        return new ResponseEntity(new Mensaje("Educacion creada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHyS dtoHys){
        if(hysService.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(hysService.existsByName(dtoHys.getName()) && hysService.getByNombre(dtoHys.getName()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoHys.getName())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }
        HyS skill = hysService.getOne(id).get();
        skill.setName(dtoHys.getName());
        skill.setPorcentaje(dtoHys.getPorcentaje());

        hysService.save(skill);
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
    }
}

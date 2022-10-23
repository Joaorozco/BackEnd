/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backendPortfolio.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombreCompleto;
    
    @Size(min = 1, max = 50, message =  "Profesion no cumple con la longitud")
    private String profesion;
    
    @Size(min = 1, max = 300, message = "no cumple con la longitud")
    private String descripcion;

    private String imagen;

    
    //Constructor 

    public Persona() {
    }

    public Persona(String nombreCompleto, String profesion, String descripcion, String imagen) {
        this.nombreCompleto = nombreCompleto;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

}

package com.backendPortfolio.backend.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class dtoPersona {
    @NotBlank
    private String nombreCompleto;
    @NotBlank
    private String profesion;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String imagen;

    public dtoPersona() {
    }

    public dtoPersona(String nombreCompleto, String profesion, String descripcion, String imagen) {
        this.nombreCompleto = nombreCompleto;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
}

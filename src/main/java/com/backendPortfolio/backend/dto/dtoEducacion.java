package com.backendPortfolio.backend.dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String tituloE;
    @NotBlank
    private String descripcionE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE,String tituloE,String descripcionE) {
        this.nombreE = nombreE;
        this.tituloE = tituloE;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
    }
    
    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
    
}

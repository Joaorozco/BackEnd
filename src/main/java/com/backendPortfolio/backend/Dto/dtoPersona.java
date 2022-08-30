package com.backendPortfolio.backend.Dto;

public class dtoPersona {
    private String nombreCompleto;
    private String profesion;
    private String descripcion;
    private String imagen;

    public dtoPersona() {
    }

    public dtoPersona(String nombreCompleto, String profesion, String descripcion, String imagen) {
        this.nombreCompleto = nombreCompleto;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
}

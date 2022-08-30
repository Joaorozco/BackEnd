package com.backendPortfolio.backend.Security.Controller;

import org.springframework.http.HttpStatus;

public class Mensaje {
  private String mensaje;

    //Contructor

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    //Getters and Setters

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}

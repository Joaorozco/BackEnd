package com.backendPortfolio.backend.security.Dto;

import java.util.HashSet;
import java.util.Set;


public class NuevoUsuario {
    private String nombreUsuario;
    private String email;
    private String password;
    private Set<String> roles = new HashSet<>();
    
    //Getters and Setter

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
    
}

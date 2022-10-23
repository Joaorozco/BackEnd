package com.backendPortfolio.backend.security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

public class JwtDto {
  private String token;
  private String bearer = "Bearer";
  private String nombreUsuario;
  private Collection<? extends GrantedAuthority> authorities;
  
  //Constructor

    public JwtDto() {
    }

    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.authorities = authorities;
    }
  
    //Gettes and Settes

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getUsername() {
        return nombreUsuario;
    }

    public void setUsername(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    
}

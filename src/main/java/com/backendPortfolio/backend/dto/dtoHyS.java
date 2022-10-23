package com.backendPortfolio.backend.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class dtoHyS {
    @NotBlank
    private String name;
    @NotBlank
    private int porcentaje;



    public dtoHyS() {
    }

    public dtoHyS(String name, int porcentaje) {
        this.name = name;
        this.porcentaje = porcentaje;
    }
}

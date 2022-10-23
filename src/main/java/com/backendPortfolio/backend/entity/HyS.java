package com.backendPortfolio.backend.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "skills")
@Getter @Setter
public class HyS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "porcentaje")
    private int porcentaje;

    public HyS() {
    }

    public HyS(String name, int porcentaje) {
        this.name = name;
        this.porcentaje = porcentaje;
    }
}

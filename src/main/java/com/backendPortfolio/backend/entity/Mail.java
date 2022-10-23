package com.backendPortfolio.backend.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mail {
    private String affair;
    private String email;
    private String message;

    public Mail() {
    }

    public Mail(String affair, String email, String message) {
        this.affair = affair;
        this.email = email;
        this.message = message;
    }
}

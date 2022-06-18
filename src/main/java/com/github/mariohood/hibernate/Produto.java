package com.github.mariohood.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Produto {
    
    @Id
    private Long id;

     private String Nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

}

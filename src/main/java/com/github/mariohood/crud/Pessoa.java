package com.github.mariohood.crud;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Pessoa extends PanacheEntity{
     
    public String nome;

    public Integer idade;
}

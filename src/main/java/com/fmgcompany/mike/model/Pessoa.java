package com.fmgcompany.mike.model;
<<<<<<< HEAD

import jakarta.persistence.MappedSuperclass;
=======
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
>>>>>>> 0d03940ecbe2442ce2831a77c36d83b06cb9b863

@Getter
@Setter
@MappedSuperclass
public abstract class Pessoa {

    protected String cpf;
    protected String nome;
    protected String email;
    protected int idade;
    protected String sexo;

}
package com.fmgcompany.mike.model;

import jakarta.persistence.OneToOne;

public class Suspeito extends Pessoa {
    
    @OneToOne
    private RelatorioOcorrencia relatorioOcorrencia;

}

package com.fmgcompany.mike.model;

import jakarta.persistence.OneToOne;

public class Vitima extends Pessoa {
    
    @OneToOne
    private RelatorioOcorrencia relatorioOcorrencia;

}
